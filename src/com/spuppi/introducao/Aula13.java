package com.spuppi.introducao;

public class Aula13 {

	/*
	 * Controle de fluxo
	 * 
	 * Switch 
	 * 
	 */
	
	public static void controleFluxo() {
		byte dia = 5;
		String diaSemana= "";
		
		switch(dia) {
			case 1:
				diaSemana = "domingo";
				break;
			case 2:
				diaSemana = "segunda";
				break;
			case 3:
				diaSemana = "ter�a";
				break;
			case 4:
				diaSemana = "quarta";
				break;
			case 5:
				diaSemana = "quinta";
				break;
			case 6:
				diaSemana = "sexta";
				break;
			case 7:
				diaSemana = "s�bado";
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
		}		
		System.out.println(diaSemana);
	}
	
	public static void main(String[] args) {
		controleFluxo();
	}
	
	
}
