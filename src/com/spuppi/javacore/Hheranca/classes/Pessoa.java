package com.spuppi.javacore.Hheranca.classes;

public class Pessoa {

	private Endereco endereco;
	
	private String nome, cpf;
	
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void imprimir() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.endereco.getRua());
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
}
