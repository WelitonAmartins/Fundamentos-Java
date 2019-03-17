package br.well.java8.nelioalves.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import br.well.java8.nelioalves.entities.Product;

public class ProgramFunction {
	/*
	 * A funcao "map" é uma funcao que aplica uma funcao a cada elementos de uma stream, gerando pra mim,
	 *  uma nova strem com os elementos transformado 
	 */
	
	public static void main(String[] args) {
		
	List<Product> list = new ArrayList<>();
	
	list.add(new Product("Tv", 900.00));
	list.add(new Product("Mouse", 50.00));
	list.add(new Product("Tablet", 350.50));
	list.add(new Product("HD Case", 80.90));
	
	// transformando todos os objetos para letras maiuscula
	
//	Function<Product, String> func = p -> p.getName().toUpperCase();
//	List<String> names = list.stream().map(func).collect(Collectors.toList());
	
	List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());  
	
	names.forEach(System.out::println);
	
	}
	
}
