
public class Aula14 {

	/*
	 * Resolu��o do Exerc�cio da aula 13
	 * 
	 */
	
	public static void exercicio(int dia) {
		boolean util = true;
		
		switch(dia) {
			case 1: case 7:
				util = false;
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				util = true;
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
		}		
		System.out.println(util ? "Dia �til" : "Fim de semana");
	}
	
	public static void main(String[] args) {
		exercicio(4);
	}
	
}
