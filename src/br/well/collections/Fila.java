package br.well.collections;

import java.util.LinkedList;
import java.util.Queue;
		//Queue - FILA
//FIFO
//first in first out, primeiro que entra � o primeiro a sair
public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();//inciando a fila
		
		fila.offer("Maria"); // adicionando na lista
		fila.offer("Jo�o");
		fila.add("Well");
	/*diferen�a de offer e add, � que offer � boolean retorna um verdadeiro ou falso,
	 * se ele nao conseguir amarzenar ele retorna false e nao um erro, j� o add iria retornar um erro
	 */
	
	System.out.println(fila.size());//pesquisa o tamanho da fila
		
	/*Peek e Element, consulta qual � o primeiro elemento da fila
	 * diferen�a entre os dois, � que Peek se a fila tiver vazia retorna null e 
	 * Element retorna um erro
	 */
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
	/*Poll e Remove, os dois removem elementos da fila
	 * mesmo esquema poll se n�o tiver elemento para remover retorna null j� o
	 * remove se tiver vazio retorna um erro
	 */
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
	
	}

}
