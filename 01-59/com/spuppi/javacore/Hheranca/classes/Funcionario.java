package com.spuppi.javacore.Hheranca.classes;

public class Funcionario extends Pessoa{

	private double salario;
	
	public Funcionario() {
		
	}
	public Funcionario(double salario) {
		this.salario = salario;
	}
	
	static {
		System.out.println("Bloco de inicialização estático de Funcionario");
	}
	{
		System.out.println("Bloco de inicialização de Funcionario 1");
	}
	{
		System.out.println("Bloco de inicialização de Funcionario 2");
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println(this.salario);
		imprimirRecibo();
	}
	
	public void imprimirRecibo() {
		System.out.println(super.nome);
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
}
