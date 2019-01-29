package br.well.java8.nelioalves.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.well.java8.nelioalves.entities.Product;

public class ProgramComparator {

	public static void main(String[] args) {
		
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet",450.00));
		
		//uma das forma de comparacao, usando o comparetor usando a a class MyComparator que foi implementada do Comparator
		//list.sort(new MyComparator());
		
	/*	
		Segunda forma fazendo uma class anonima 
		Comparator<Product> comp = new Comparator<Product> () {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		list.sort(comp); */
		
	/*
		Terceira forma usando as expressão lambda, definindo uma funcao anonima 
		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		list.sort(comp); */

	/*
	 Indentando a expressao lambda acima, reduzindo codigo para a mesma funcao
		Comparator<Product> comp = (p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		list.sort(comp); */
		
	// Resumindo ainda mais a expressao lambda, tambem etende dessa forma o comparator 
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
