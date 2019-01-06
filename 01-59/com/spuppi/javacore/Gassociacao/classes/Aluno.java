package com.spuppi.javacore.Gassociacao.classes;

public class Aluno {
	
	private Seminario seminario;

	private String nome;
	private int idade;
		
	public Aluno() {
		
	}
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void imprimir() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.seminario.getTitulo());
	}
	
	public Seminario getSeminario() {
		return seminario;
	}
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	
}
