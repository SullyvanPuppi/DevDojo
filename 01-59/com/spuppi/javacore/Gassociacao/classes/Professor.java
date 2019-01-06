package com.spuppi.javacore.Gassociacao.classes;

public class Professor {
	
	private Seminario[] seminarios; 
	
	private String nome, especialidade;

	public Professor() {
		
	}	
	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public void imprimir() {
		System.out.println(this.nome);
		System.out.println(this.especialidade);
		for(Seminario seminario : seminarios) {
			System.out.println(seminario.getTitulo() + " ");
		}
	}
	
	public Seminario[] getSeminarios() {
		return seminarios;
	}
	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
