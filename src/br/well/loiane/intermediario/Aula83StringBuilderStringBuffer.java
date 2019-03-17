package br.well.loiane.intermediario;

public class Aula83StringBuilderStringBuffer {

	public static void main(String[] args) {

		String[] letras = { "B", "C", "D", "E", "F" };

		String alfabeto = "";

		for (String letra : letras) {
			alfabeto += letra;
		}
		System.out.println(alfabeto);

		// =============================================

		StringBuffer sb = new StringBuffer();
		for (String letra : letras) {
			sb.append(letra);
		}

		alfabeto = sb.toString();

		System.out.println(alfabeto);

		alfabeto = new String(sb);
		System.out.println(alfabeto);

		System.out.println(sb.reverse());

		System.out.println(sb.length());

		System.out.println("======================StringBuilder====================================");

		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras) {
			sb_.append(letra);
		}
		alfabeto = sb_.toString();
		System.out.println(alfabeto);
		
		// Qual a diferença do StringBuffer para StringBuilder se eles fazem a mesma coisa?

		// StringBuffer é threads self se trabalhar em ambientes com mais de um threads para sicronizar metados

		// pergunta de entrevista, voce tem mil elementos e devem concatenar em uma
		// string qual a forma mais correta?
		// concatenar utilizando StringBuffer ou StringBuilder

	}

}
