package com.spuppi.javacore.introducaometodos.tests;

import com.spuppi.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		//calc.somaDoisNumeros(5,5);
		
		//calc.subtraiDoisNumeros(5,5);
		
		System.out.println(calc.somaArray(new int[]{2,2,2,2}));
		
		System.out.println(calc.somaVarArgs(2,2,2,2,2));

	}

}
