package com.spuppi.javacore.Csobrecargametodos.tests;

import com.spuppi.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Chica da Silva", "111.222.333.44", "11.222.333-7", 4500);
		
		funcionario.imprimir();
		
	}

}
