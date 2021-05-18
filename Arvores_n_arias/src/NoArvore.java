
public class NoArvore<T> {
	T info = null;
	NoArvore<T> primeiro = null;
	NoArvore<T> proximo = null;
	
	public NoArvore(T info) {
		this.info = info;
	}
		
	public void inserirFilho(NoArvore<T> sa) {
		sa.proximo = primeiro;
		primeiro = sa;
	}
	
	public NoArvore<T> getPrimeiro(){
		return this.primeiro;
	}
	
	public NoArvore<T> getProximo(){
		return this.proximo;
	}
	
	public T getInfo(){
		return this.info;
	}
	
	public NoArvore<T> setInfo(){
		return this.proximo;
	}
}
