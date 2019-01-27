package br.well.java8.nelioalves.application;

import java.util.ArrayList;
import java.util.List;

import br.well.java8.nelioalves.entities.Product;

public class ProgramPredicate {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		// expressão lambda que remove todos os cara que seja maior que 100
//		list.removeIf(p -> p.getPrice() >= 100);
		
		
		//referencia pra metado, aceito no sistema lambda do java 
		list.removeIf(Product::staticProductPredicate);
		
		for( Product p : list) {
			System.out.println(p);
		}
	}

}
