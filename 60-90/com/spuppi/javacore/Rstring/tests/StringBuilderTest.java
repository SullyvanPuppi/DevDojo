package com.spuppi.javacore.Rstring.tests;

public class StringBuilderTest {

	public static void main(String[] args) {
		//String f = "Frase comum";
		StringBuilder sb = new StringBuilder(10);//Padrão 16 caracteres
		sb.append("Uma frase comum.");
		sb.append("Teste");
		
		
		
		System.out.println(sb.delete(0, 4));
	}

}
