package com.spuppi.javacore.Fmodificadorestatico.tests;

import com.spuppi.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		Carro c1 = new Carro("BMW", 280);
		Carro c2 = new Carro("Audi", 275);
		Carro c3 = new Carro("Mercedes", 290);
		
		c1.imprimir();
		
		c1.setVelocidadeLimite(220);
		
		c1.imprimir();
		
	}

}
