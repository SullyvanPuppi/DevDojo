package com.spuppi.introducao;

public class Aula11 {

	/*
	 * Controle de fluxo
	 * 
	 * Operador tern�rio
	 * 
	 */
	
	
	public static void controleIfUmaLinha() {
		int idade = 20;
		String status;
		
		status = (idade >= 18) ? "Adulto" : "N�o adulto";		
		System.out.println(status);		
	}
	
	public static void main(String[] args) {
		controleIfUmaLinha();
	}
	
	
}
