package com.spuppi.javacore.Gassociacao.classes;

public class Seminario {
	
	private Aluno[] alunos;
	private Professor professor;
	private Local local;
	
	private String titulo;

	public Seminario() {
		
	}
	public Seminario(String titulo) {
		this.titulo = titulo;
	}
	
	public void imprimir() {
		System.out.println(this.titulo);
		System.out.println(this.professor.getNome());
		System.out.println(this.local.getRua() + ", " + this.local.getBairro());
		for(Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
	}	
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
