package com.spuppi.javacore.Passertions.tests;

public class AssetTest {

	public static void main(String[] args) {
		calculaSalario(-1000);
	}
	
	private static void calculaSalario(double salario) {
		assert(salario > 0): "O salário não deve ser menor que zero, salário informado: " + salario;
	}
	
	public static void calculaSalario2(double salario) {
		if(salario < 0) {
			throw new IllegalArgumentException();
		}
	}

}
