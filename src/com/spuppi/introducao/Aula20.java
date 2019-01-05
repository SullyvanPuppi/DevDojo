package com.spuppi.introducao;

public class Aula20 {

	/*
	 * Arrays parte 3
	 * foreach
	 * 
	 */
	
	public static void exemplo() {
		int[] numeros = new int [5];
		int[] numeros2 = {1,2,3,4,5};
		int[] numeros3 = new int[] {1,2,3,4,5};
		
		for(int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
	}
	
	public static void exemplo2() {
		String[] nomes = {"Juju","JãoJão","XuXu"};
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}
	
	
	
	public static void main(String[] args) {
		exemplo2();
	}
	
}
