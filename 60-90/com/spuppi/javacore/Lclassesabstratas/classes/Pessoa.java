package com.spuppi.javacore.Lclassesabstratas.classes;

public abstract class Pessoa {
	
	protected String nome;
	
	public abstract void imprimir();

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
