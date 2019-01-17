package com.spuppi.javacore.Rstring.tests;

public class StringTest {

	public static void main(String[] args) {
		String nome = "Didi";
		nome = nome.concat("Mocó");
		String nome2 = "Didi";
		String nome3 = new String("Dedé");
		
		String teste = "Goku";
		String teste2 = "goku";
		
		System.out.println(teste.charAt(0));
		System.out.println(teste.equals(teste2));
		System.out.println(teste.length());
		System.out.println(teste.replace("o", "a"));
		System.out.println(teste.toLowerCase());
		System.out.println(teste.substring(1,3));
		System.out.println(teste.trim());
	}

}
