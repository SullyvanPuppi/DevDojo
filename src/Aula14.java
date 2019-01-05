
public class Aula14 {

	/*
	 * Resolução do Exercício da aula 13
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
				System.out.println("Opção inválida");
				break;
		}		
		System.out.println(util ? "Dia útil" : "Fim de semana");
	}
	
	public static void main(String[] args) {
		exercicio(4);
	}
	
}
