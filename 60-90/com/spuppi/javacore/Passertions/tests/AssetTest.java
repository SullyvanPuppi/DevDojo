package com.spuppi.javacore.Passertions.tests;

public class AssetTest {

	public static void main(String[] args) {
		calculaSalario(-1000);
	}
	
	private static void calculaSalario(double salario) {
		assert(salario > 0): "O sal�rio n�o deve ser menor que zero, sal�rio informado: " + salario;
	}
	
	public static void calculaSalario2(double salario) {
		if(salario < 0) {
			throw new IllegalArgumentException();
		}
	}

}
