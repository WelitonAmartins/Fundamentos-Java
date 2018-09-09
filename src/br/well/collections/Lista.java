package br.well.collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String [] args) {
		List<String> aprovados =new ArrayList<>();//iniciando a lista
		aprovados.add("Weliton");
		aprovados.add("Leticia");  //adicionando elementos na lista
		aprovados.add("João");
		
		System.out.println(aprovados.size());//pesquisanto quantos elemento possui na lista
		System.out.println(aprovados.get(1));//trazendo o elemento da posição 
		System.out.println(aprovados.remove("João"));//exluindo um elemento da lista
		
		System.out.println(" ");
		
		//fazendo um foreach para ler toda a lista
		for(String lista : aprovados) {
			System.out.println(lista);
		}

	}
}
