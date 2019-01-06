package com.spuppi.javacore.Lclassesabstratas.classes;

public abstract class Funcionario extends Pessoa{

	protected String cpf;
	protected double salario;
		
	
	public Funcionario() {
		
	}
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " CPF: " + this.cpf + " Salario: " + this.salario;
	}	
	public abstract void calculaSalario();	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
}
