import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArvoreTest {

	@Test
	void toStringTest() {			
		NoArvore<Integer> no9 = new NoArvore<>(9);
		NoArvore<Integer> no10 = new NoArvore<>(10);		
		NoArvore<Integer> no4 = new NoArvore<>(4);
		no4.inserirFilho(no10);
		no4.inserirFilho(no9);

		
		NoArvore<Integer> no8 = new NoArvore<>(8);
		NoArvore<Integer> no3 = new NoArvore<>(3);
		no3.inserirFilho(no8);
		
		NoArvore<Integer> no5 = new NoArvore<>(5);
		NoArvore<Integer> no6 = new NoArvore<>(6);
		NoArvore<Integer> no7 = new NoArvore<>(7);	
		NoArvore<Integer> no2 = new NoArvore<>(2);				
		no2.inserirFilho(no7);
		no2.inserirFilho(no6);
		no2.inserirFilho(no5);
		
		NoArvore<Integer> no1 = new NoArvore<>(1);
		no1.inserirFilho(no4);		
		no1.inserirFilho(no3);
		no1.inserirFilho(no2);
		
		
		Arvore<Integer> arvore = new Arvore<>();
		arvore.setRaiz(no1);
		
		assertEquals(arvore.toString(), "<1<2<5><6><7>><3<8>><4<9><10>>>");
	}
	@Test
	void pertence1Test() {
		NoArvore<Integer> no9 = new NoArvore<>(9);
		NoArvore<Integer> no10 = new NoArvore<>(10);		
		NoArvore<Integer> no4 = new NoArvore<>(4);
		no4.inserirFilho(no10);
		no4.inserirFilho(no9);

		
		NoArvore<Integer> no8 = new NoArvore<>(8);
		NoArvore<Integer> no3 = new NoArvore<>(3);
		no3.inserirFilho(no8);
		
		NoArvore<Integer> no5 = new NoArvore<>(5);
		NoArvore<Integer> no6 = new NoArvore<>(6);
		NoArvore<Integer> no7 = new NoArvore<>(7);	
		NoArvore<Integer> no2 = new NoArvore<>(2);				
		no2.inserirFilho(no7);
		no2.inserirFilho(no6);
		no2.inserirFilho(no5);
		
		NoArvore<Integer> no1 = new NoArvore<>(1);
		no1.inserirFilho(no4);		
		no1.inserirFilho(no3);
		no1.inserirFilho(no2);		
		
		Arvore<Integer> arvore = new Arvore<>();
		arvore.setRaiz(no1);
		
		assertEquals(arvore.pertence(no7.getInfo()), true);
	}
	
	
	@Test
	void pertence2Test() {
		NoArvore<Integer> no9 = new NoArvore<>(9);
		NoArvore<Integer> no10 = new NoArvore<>(10);		
		NoArvore<Integer> no4 = new NoArvore<>(4);
		no4.inserirFilho(no10);
		no4.inserirFilho(no9);

		
		NoArvore<Integer> no8 = new NoArvore<>(8);
		NoArvore<Integer> no3 = new NoArvore<>(3);
		no3.inserirFilho(no8);
		
		NoArvore<Integer> no5 = new NoArvore<>(5);
		NoArvore<Integer> no6 = new NoArvore<>(6);
		NoArvore<Integer> no7 = new NoArvore<>(7);	
		NoArvore<Integer> no2 = new NoArvore<>(2);				
		no2.inserirFilho(no7);
		no2.inserirFilho(no6);
		no2.inserirFilho(no5);
		
		NoArvore<Integer> no1 = new NoArvore<>(1);
		no1.inserirFilho(no4);		
		no1.inserirFilho(no3);
		no1.inserirFilho(no2);
				
		Arvore<Integer> arvore = new Arvore<>();
		arvore.setRaiz(no1);
		
		assertEquals(arvore.pertence(55), false);
	}
	
	@Test
	void contarNosTest() {
		NoArvore<Integer> no9 = new NoArvore<>(9);
		NoArvore<Integer> no10 = new NoArvore<>(10);		
		NoArvore<Integer> no4 = new NoArvore<>(4);
		no4.inserirFilho(no10);
		no4.inserirFilho(no9);

		
		NoArvore<Integer> no8 = new NoArvore<>(8);
		NoArvore<Integer> no3 = new NoArvore<>(3);
		no3.inserirFilho(no8);
		
		NoArvore<Integer> no5 = new NoArvore<>(5);
		NoArvore<Integer> no6 = new NoArvore<>(6);
		NoArvore<Integer> no7 = new NoArvore<>(7);	
		NoArvore<Integer> no2 = new NoArvore<>(2);				
		no2.inserirFilho(no7);
		no2.inserirFilho(no6);
		no2.inserirFilho(no5);
		
		NoArvore<Integer> no1 = new NoArvore<>(1);
		no1.inserirFilho(no4);		
		no1.inserirFilho(no3);
		no1.inserirFilho(no2);		
		
		Arvore<Integer> arvore = new Arvore<>();
		arvore.setRaiz(no1);
		
		assertEquals(arvore.contarNos(), 10);
	}
}
