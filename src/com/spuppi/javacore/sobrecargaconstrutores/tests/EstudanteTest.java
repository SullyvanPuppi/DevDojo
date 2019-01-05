package com.spuppi.javacore.sobrecargaconstrutores.tests;

import com.spuppi.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante estudante = new Estudante("414141A","Maria","41.424.454-9", new double[]{5,5,5});
		
		estudante.imprimir();

	}

}
