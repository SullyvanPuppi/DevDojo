package com.spuppi.javacore.Rstring.tests;

public class StringPerfomanceTest {

	public static void main(String[] args) {
		System.out.println("inicio");
		long inicio = System.currentTimeMillis();
		concatString(100);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto: " + (fim-inicio) + " ms");
	}
	
	public static void concatString(int tam) {
		System.out.println("Dentro do concat");
		String string = "";
		for(int i = 0; i < tam; i++) {
			string += i;
		}
	}
	
	public static void concatStringBuilder(int tam) {
		String string = "";
		for(int i = 0; i < tam; i++) {
			string += i;
		}
	}

}
