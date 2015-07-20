package br.com.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static boolean ehMultiploDe(int num, int multi){
		return (num % multi == 0) ? true : false;
	}
	
	private static List<Integer> retornaNumerosMultiplosDe(int numero){
		List<Integer> multiplos = new ArrayList<Integer>();
		for (int i = 1; i <= numero; i++) {
			if(ehMultiploDe(numero, i)){
				multiplos.add(i);
			}
		}
		return multiplos;
	}
	
	private static String imprimeLista(List<Integer> multiplos) {
		String saida = "";
		for (Integer integer : multiplos) {
			saida += integer + ",";
		}
		return saida;
	}
	
	public static void main(String[] args) {
		List<Integer> multiplos = retornaNumerosMultiplosDe(2);
		System.out.println(imprimeLista(multiplos));
	}

}
