package com.spuppi.introducao;

public class Aula12 {

	/*
	 * Resolu��o do exerc�cio da aula 11
	 * 
	 */
	
	public static void exercicio() {
		double salario = 5000;
		double imposto;
		
		if(salario < 1000) {
			imposto = 0.05;
		}else if(salario >= 1000 && salario < 2000){
			imposto = 0.1;			
		}else if(salario >= 2000 && salario < 4000) {
			imposto = 0.15;
		}else {
			imposto = 0.2;
		}
		
		System.out.println("Sal�rio Base: R$ " + salario + "\nImposto aplic�vel: " + imposto * 100 + "% \nImposto descontado R$ " + salario * imposto + "\nSal�rio L�quido: R$ " + (salario - (salario * imposto)));
	}
	
	public static void main(String[] args) {
		exercicio();
	}
	
}
