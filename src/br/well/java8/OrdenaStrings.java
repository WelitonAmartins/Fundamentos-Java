package br.well.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {
		
	/*	@Ordenando as string de modo padrao de A a Z
	 * 
		List<String> palavras = new ArrayList<String>();
		palavras.add("Java 8");
		palavras.add("Spring boot");
		palavras.add("JPA");
		
		Collections.sort(palavras);
		System.out.println(palavras);
		*/
		// =================================================================
		
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("Java 8");
		palavras.add("Spring boot");
		palavras.add("JPA");
		
		Comparator<String> comparador = new ComparadorPorTamanho();//chamando o comparador por tamanho
		//Collections.sort(palavras, comparador); -> antes do java 8
		
		palavras.sort(comparador);// agora com java 8 apenas isso, só vai
		System.out.println(palavras);
		
	/*	for (String p : palavras) {
			System.out.println(p);
		}*/
		
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
	}
	

}

class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
		
	}
	
}
class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length()< s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
	
}