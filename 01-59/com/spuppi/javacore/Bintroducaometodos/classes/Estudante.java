package com.spuppi.javacore.Bintroducaometodos.classes;

public class Estudante {

	public String nome;
	public int idade;
	public double[] notas = new double[3];
	
	// getters and setters
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
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}


	public void imprimir() {
		double media = (this.notas[0] + this.notas[1] + this.notas[2]) / 3;
		String status = "Reprovado!";
		
		if(media >= 6) {
			status = "Aprovado!";
		}
		
		System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nNotas: P1 " + this.notas[0] + ", P2 " + this.notas[1] + ", P3 " + this.notas[2] + "\nMédia: " + media + "\nStatus: " + status);		
	};
	
}
