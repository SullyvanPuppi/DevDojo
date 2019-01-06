package com.spuppi.javacore.Fmodificadorestatico.classes;

public class Carro {
	
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 240;
	
	public Carro() {
		
	}	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public void imprimir() {
		System.out.println(this.nome);
		System.out.println(this.velocidadeMaxima);
		System.out.println(this.velocidadeLimite);
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
	
	
}
