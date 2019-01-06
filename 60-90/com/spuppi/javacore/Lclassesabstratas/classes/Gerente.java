package com.spuppi.javacore.Lclassesabstratas.classes;

public class Gerente extends Funcionario {

	public Gerente() {
		
	}

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public void calculaSalario() {
		this.salario = this.salario + (this.salario * 0.2);
	}
	

	@Override
	public void imprimir() {
		System.out.println("Dentro da classe Gerente");
		
	}

	
	
}
