package br.well.java8.nelioalves.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import br.well.java8.nelioalves.entities.Product;

public class ProgramConsumer {
	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
	/*	Criando uma funcao lambda para fazer a soma com consumer
		double factor =1.1;
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		
			list.forEach(cons);
		*/
		
		double factor =1.1;
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		//acrecentando 10% em cada valor com lamdba com metado estatico fora
//		list.forEach(Product::staticPriceUpdate);
		
		list.forEach(System.out::println);
	}

}
