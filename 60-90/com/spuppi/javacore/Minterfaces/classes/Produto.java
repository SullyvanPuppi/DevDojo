package com.spuppi.javacore.Minterfaces.classes;

public class Produto implements Tributavel, Transportavel{

	private String nome;
	private double peso, preco, precoFinal, valorFrete;


	public Produto(String nome, double peso, double preco) {
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}
	
	@Override
	public void calcularImposto() {
		precoFinal = this.preco + (this.preco * IMPOSTO);
	}

	@Override
	public void calcularFrete() {
		this.valorFrete = this.preco / peso * 0.1;
	}	
		
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", peso=" + peso + ", preco=" + preco + ", precoFinal=" + precoFinal
				+ ", valorFrete=" + valorFrete + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPrecoFinal() {
		return precoFinal;
	}
	public double getValor() {
		return valorFrete;
	}	
}
