package com.spuppi.javacore.Bintroducaometodos.classes;

public class Calculadora {
	
	public void somaDoisNumeros(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void subtraiDoisNumeros(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	public void multiplicaDoisNumeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public double divideDoisNumeros(double num1, double num2) {
		if(num2 != 0 ) {
			return num1 / num2;	
		}
		return 0;
	}
	
	public void alteraDoisNumeros(int num1, int num2) {
		
	}
	
	public int somaArray(int[] numeros) {
		int soma = 0;
		for(int numero : numeros) {
			soma += numero;
		}
		return soma;
	}
	
	public int somaVarArgs(int... numeros) {
		int soma = 0;
		for(int numero : numeros) {
			soma += numero;
		}
		return soma;
	}

}
