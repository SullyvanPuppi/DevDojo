package com.spuppi.introducao;

public class Aula19 {

	/*
	 * Arrays parte 2
	 *
	 * valores padr�es
	 * 
	 * byte, short, int, long, float, double = 0
	 * char '\u0000' ''
	 * boolean false
	 * reference null
	 * 
	 */
	
	public static void exemplo() {
		String[] nomes = new String[3];
		
		nomes[0] = "Naruto";
		nomes[1] = "Goku";
		nomes[2] = "Luffy";
		
		for(int i=0; i< nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
	
	public static void main(String[] args) {
		exemplo();
	}

}
