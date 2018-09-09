package br.well.collections;

import java.util.Stack;

		//Stack - PILHA
public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		
		pilha.push("O pequeno Príncipe");//adicionando elementos na pilha
		pilha.push("O Hobbit");
		pilha.push("Don Quinxote");
		
		//peek pega o primeiro elemento da pilha sem retirar da pilha
		System.out.println(pilha.peek());
		
		//pop retira o livro da pilha e retorna ele
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
	}

}
