package com.spuppi.javacore.Aintroducaoclasses.tests;

import com.spuppi.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.placa = "DPJ-6720";
		carro.modelo = "Polo";
		carro.velocidadeMaxima = 220;
		
		System.out.println(carro.modelo);

	}

}
