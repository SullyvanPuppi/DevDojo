package com.spuppi.javacore.Eblocodeinicializa�ao.classes;

public class Cliente {

	private int[] numParcelas = new int[80];


	{
		System.out.println("Bloco de inicializa��o");
		for(int i = 1; i<=80; i++) {
			this.numParcelas[i-1] = i;
		}
	}
	public Cliente() {

	}

	public int[] getNumParcelas() {
		return numParcelas;
	}
	public void setNumParcelas(int[] numParcelas) {
		this.numParcelas = numParcelas;
	}
	
	
	
}
