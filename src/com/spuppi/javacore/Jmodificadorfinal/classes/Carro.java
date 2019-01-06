package com.spuppi.javacore.Jmodificadorfinal.classes;

public class Carro {
	
	public static final double VELOCIDADE_FINAL = 250;
	
	private final Comprador comprador = new Comprador();
	private String nome, marca;

	@Override
	public String toString() {
		return "Carro{nome: " + nome + " marca: " + marca + "}";
	}
	public Carro() {
		
	}
	
	public final void imprimir() {
		System.out.println(this.nome);
	}
	
	public Comprador getComprador() {
		return comprador;
	}
	public Carro(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
