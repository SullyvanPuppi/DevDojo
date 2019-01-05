package com.spuppi.javacore.Dsobrecargaconstrutores.classes;

public class Estudante {

	private String matricula, nome, rg;
	private double[] notas;
	
		
	public Estudante(String matricula, String nome, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	public Estudante(String matricula, String nome, String rg, double[] notas) {
		this(matricula, nome, notas);
		this.rg = rg;
	}
	public Estudante() {
		
	}
	
	public void imprimir() {
		System.out.println(this.nome);
		System.out.println(this.matricula);
		System.out.println(this.rg);
		for(double nota : notas) {
			System.out.println(nota + " ");
		}
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	
}
