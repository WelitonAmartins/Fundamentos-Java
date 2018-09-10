package br.well.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		//estrutura chave e valor 
/*		MAP
 * 	SET  | LIST
 * CHAVE | VALOR
 * CHAVE | VALOR
 * CHAVE | VALOR 
 * 
 *na chave eu nao aceito repetição e no valor eu aceito repetição 
 */
		
		Map<Integer, String> aprovados = new HashMap<>();
		aprovados.put(1, "Pedro");// put ser para adicionaar quanto para substituir caso tenha um regitro com a mesma chave
		aprovados.put(2, "Ana");
		aprovados.put(3, "Bia");
		aprovados.put(4, "Carlos");
		
		System.out.println(aprovados.keySet());// mostra o conjunto de chave que tem ao todo
		System.out.println(aprovados.values());// mostra o conjunto dos valores 
		System.out.println(aprovados.entrySet());// conjunto de registros, mostra as chave e os valores
		
		aprovados.put(3, "Well");//substituindo a chave e valor da posição 3
		System.out.println(aprovados.get(3));//buscando o dados pela chave
		
		System.out.println(aprovados.containsKey(4));// retorna um valor boolean se existe ou nao em chave
		System.out.println(aprovados.containsValue("Bia"));//retorna um valor boolean se existe ou nao em valor
		
		System.out.println("For para consumir as chaves");
		for(Integer codigo : aprovados.keySet()) {
			System.out.println(codigo);
		}
		
		System.out.println("For para consumir os valores......");
		for(String valor : aprovados.values()) {
			System.out.println(valor);
		}
		System.out.println(" ");
		System.out.println("For para consumir o conjunto chave e valor");
		for(Entry<Integer, String> registro : aprovados.entrySet()) {//Entry é um agrupamento específico do map
			System.out.println(registro.getKey()+" "+ registro.getValue());
		}
	}
}
