package br.well.collections;

import java.util.LinkedList;
import java.util.Queue;
		//Queue - FILA
//FIFO
//first in first out, primeiro que entra é o primeiro a sair
public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();//inciando a fila
		
		fila.offer("Maria"); // adicionando na lista
		fila.offer("João");
		fila.add("Well");
	/*diferença de offer e add, é que offer é boolean retorna um verdadeiro ou falso,
	 * se ele nao conseguir amarzenar ele retorna false e nao um erro, já o add iria retornar um erro
	 */
	
	System.out.println(fila.size());//pesquisa o tamanho da fila
		
	/*Peek e Element, consulta qual é o primeiro elemento da fila
	 * diferença entre os dois, é que Peek se a fila tiver vazia retorna null e 
	 * Element retorna um erro
	 */
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
	/*Poll e Remove, os dois removem elementos da fila
	 * mesmo esquema poll se não tiver elemento para remover retorna null já o
	 * remove se tiver vazio retorna um erro
	 */
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
	
	}

}
