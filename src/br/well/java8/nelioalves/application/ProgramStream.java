package br.well.java8.nelioalves.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramStream {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//stream().map cria uma funcao para cada elemento
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//Stream.of adiciona ja os elementos desejados na stream
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		//Stream.iterate define o valor inicial e qual funcao que vai obter des da inical e deppis tendo que limitar o ponto de chegada
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		//stream apara gerar a sequencia de fibonacci
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
	}

}
