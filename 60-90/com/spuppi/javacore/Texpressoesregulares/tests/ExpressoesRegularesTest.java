package com.spuppi.javacore.Texpressoesregulares.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		//String regex = "\\d";//Busca todos os dígitos
		//String regex = "\\D";//Busca todos os não dígitos
		//String regex = "\\s";//Busca todos espaços em branco
		String regex = "\\S";//Busca todos espaços não branco
		
		String texto = "aba123aaaab a145";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("Texto: " + texto);
		System.out.println("Indíce: 0123456789");
		System.out.println("Expressão: " + matcher.pattern());
		System.out.println("Posições encontradas:");
		while(matcher.find()) {
			System.out.print(matcher.start() + " ");
		}
	}

}
