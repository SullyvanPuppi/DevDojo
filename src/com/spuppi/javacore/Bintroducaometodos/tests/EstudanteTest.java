package com.spuppi.javacore.Bintroducaometodos.tests;

import com.spuppi.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		
		estudante.nome = "Sullyvan";
		estudante.idade = 32;
		estudante.notas = new double[]{5,5,5};
		
		estudante.imprimir();
	}

}
