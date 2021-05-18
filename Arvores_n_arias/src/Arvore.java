
public class Arvore<T> {
	NoArvore<T> raiz;
	
	public Arvore() {
		
	}
	
	public NoArvore<T> getRaiz(){
		return this.raiz;
	}
	
	public void setRaiz(NoArvore<T> raiz) {
		this.raiz = raiz;
	}
	
	public boolean pertence(T info){
		return pertence(raiz, info);
	}
	
	private boolean pertence(NoArvore<T> no, T info){
		if(no.getInfo().equals(info)) {
			return true;
		} else {
			NoArvore<T> primeiro = no.getPrimeiro();
			while(primeiro != null) {
				if(pertence(primeiro, info)) 
					return true;
				else
					primeiro = primeiro.getProximo();
			}
			return false;
		}		
	}
	
	public int contarNos() {
		return this.raiz == null ? 0 : contarNos(this.raiz);

	}
	
	private int contarNos(NoArvore<T> no) {
		int quantidade = 1;
		
		NoArvore<T> primeiro = no.getPrimeiro();
		
		while(primeiro != null) {
			quantidade  += contarNos(primeiro);
			primeiro = primeiro.getProximo();
		}
		return quantidade;
	}
	
	public String toString() {
		return obterRepresentacaoTextual(this.raiz);
	}
	
	private String obterRepresentacaoTextual(NoArvore<T> no) {
		NoArvore<T> p;
		
		String arvoreString = "<";
		
		arvoreString += no.getInfo();
		
		p = no.getPrimeiro();
		
		while (p != null) {
			arvoreString += obterRepresentacaoTextual(p);
			p = p.getProximo();
		}
		
		return arvoreString += ">";
	}
}
