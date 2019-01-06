package com.spuppi.javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario{
	
	private double totalVendas;
	
	public Vendedor() {
		
	}
	public Vendedor(String nome, String cpf, double salario, double totalVendas) {
		super(nome, cpf, salario);
		this.totalVendas = totalVendas;
	}

	@Override
	public void calculaSalario() {
		this.salario = salario + (totalVendas * 0.05);
	}
	
	@Override
	public void imprimir() {
		System.out.println("Dentro da Classe Vendedor");		
	}

	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}	
}
