package com.spuppi.introducao;

public class Aula7 {

	/*
	 * Operador resto
	 * Operadores de comparação
	 * 
	 * */
	
	public static void resto() {
		int numeroIntero = 20;
		long numeroLong = 200000L;
		
		double numeroDouble = 10d;
		float numeroFloat = 20f;
		
		int resto = 10%2;
		
		System.out.println(resto);
	}
	
	public static void operadoresDeComparacao() {
		boolean dezMaiorQueVinte = 10 >= 20;
		boolean dezMenorQueVinte = 10<=20;
		
		System.out.println(dezMenorQueVinte);		
	}
	
	
	public static void main(String[] args) {
		operadoresDeComparacao();
	}
	
}
