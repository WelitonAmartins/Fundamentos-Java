package br.well.regex;

public class PoliticaDeSenha {

	public static boolean validaPlaca(String placa) {
		boolean valido = true;
		if (!placa.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d.*)(?=.*\\W.*)[a-zA-Z0-9\\S]{8,15}$")) {
			valido = false;
		}
//		if (!placa.substring(0, 3).matches("[A-Z]*")) {
//			valido = false;
//		}
////		if (!placa.substring(3).matches("[0-9]*")) {
////			valido = false;
////		}
//		if(!placa.substring(3).matches("[!#@$%¨&*].*")){
//			valido = false;
//		}
		return valido;
	}
	
//	^ (? =. * [az]) (? =. * [AZ]) (? =. * \ d. *) (? =. * \ W. *) [a-zA-Z0-9 \ S] {8,15} $

	public static void main(String[] args) {
		System.out.println(validaPlaca("Weliton123@@###"));
	}

}
