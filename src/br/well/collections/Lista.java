package br.well.collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String [] args) {
		List<String> aprovados =new ArrayList<>();//iniciando a lista
		aprovados.add("Weliton");
		aprovados.add("Leticia");  //adicionando elementos na lista
		aprovados.add("Jo�o");
		
		System.out.println(aprovados.size());//pesquisanto quantos elemento possui na lista
		System.out.println(aprovados.get(1));//trazendo o elemento da posi��o 
		System.out.println(aprovados.remove("Jo�o"));//exluindo um elemento da lista
		
		System.out.println(" ");
		
		//fazendo um foreach para ler toda a lista
		for(String lista : aprovados) {
			System.out.println(lista);
		}

	}
}
