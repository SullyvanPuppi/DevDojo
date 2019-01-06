package com.spuppi.javacore.Kenumeracao.classes;

public class Cliente {

	private String nome;
	private TipoCliente tipo;
	
	public Cliente(String nome, TipoCliente pessoaFisica) {
		this.nome = nome;
		this.tipo = pessoaFisica;
	}
	
	public String toString() {
		return "nome: " + this.nome + " Tipo: " + tipo;
	}
	
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
}
