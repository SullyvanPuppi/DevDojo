package com.spuppi.javacore.Fmodificadorestatico.tests;

public class Cliente {

	private int[] numParcelas = new int[80];

	static{
		System.out.println("Bloco de inicializa��o est�tico");
		
	}
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
