package com.spuppi.javacore.introducaoclasses.test;

import com.spuppi.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante joao = new Estudante();
		
		joao.nome = "João";
		joao.matricula = "1212";
		joao.idade = 15;
		
		System.out.println(joao.nome);
		
	}

}
