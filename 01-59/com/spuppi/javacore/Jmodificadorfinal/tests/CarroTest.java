package com.spuppi.javacore.Jmodificadorfinal.tests;

import com.spuppi.javacore.Jmodificadorfinal.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		Carro c = new Carro();
		System.out.println(c.getComprador());
		c.getComprador().setNome("Malaquias");
		System.out.println(c.getComprador());
	}

}
