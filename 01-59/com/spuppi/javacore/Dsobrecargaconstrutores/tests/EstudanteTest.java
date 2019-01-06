package com.spuppi.javacore.Dsobrecargaconstrutores.tests;

import com.spuppi.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante estudante = new Estudante("414141A","Maria","41.424.454-9", new double[]{5,5,5});
		
		estudante.imprimir();

	}

}
