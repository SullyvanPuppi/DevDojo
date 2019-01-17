package com.spuppi.javacore.Texpressoesregulares.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		//String regex = "\\d";//Busca todos os d�gitos
		//String regex = "\\D";//Busca todos os n�o d�gitos
		//String regex = "\\s";//Busca todos espa�os em branco
		String regex = "\\S";//Busca todos espa�os n�o branco
		
		String texto = "aba123aaaab a145";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("Texto: " + texto);
		System.out.println("Ind�ce: 0123456789");
		System.out.println("Express�o: " + matcher.pattern());
		System.out.println("Posi��es encontradas:");
		while(matcher.find()) {
			System.out.print(matcher.start() + " ");
		}
	}

}
