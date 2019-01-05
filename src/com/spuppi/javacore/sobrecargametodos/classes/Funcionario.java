package com.spuppi.javacore.sobrecargametodos.classes;

public class Funcionario {

	private String nome, cpf, rg;
	private double salario;
	
	public Funcionario(){
		
	}	
	public Funcionario(String nome, String cpf, String rg, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.salario = salario;
	}
	
	public void init(String nome, String cpf, String rg, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.salario = salario;
	}
	public void init(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
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
	
	public void imprimir() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.rg);
		System.out.println(this.salario);
	}
	
}
