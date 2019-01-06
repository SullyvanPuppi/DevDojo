package com.spuppi.introducao;

public class Aula10 {

	/*
	 * Controle de fluxo
	 * 
	 * 
	 */
	
	public static void controleFluxo() {
		int idade = 16;
		float salario = 2000;
		if(idade > 18) {
			System.out.println("Entrou no if");
		}else if(idade>15){
			System.out.println("Entre 15 e 18");
		}else {
			System.out.println("Menor que 15");
		}		
	}
	
	public static void main(String[] args) {
		controleFluxo();
	}
	
}
