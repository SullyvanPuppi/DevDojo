package com.spuppi.javacore.Hheranca.classes;

public class Funcionario extends Pessoa{

	private double salario;
	
	public Funcionario() {
		
	}
	public Funcionario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
}
