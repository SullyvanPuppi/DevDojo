package com.spuppi.javacore.introducaometodos.tests;

import com.spuppi.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		
		estudante.nome = "Sullyvan";
		estudante.idade = 32;
		estudante.notas = new double[]{5,5,5};
		
		estudante.imprimir();
	}

}
