
public class Aula16 {

	/*
	 * Exerc�cio estrutura de repeti��o
	 * 
	 * 
	 * 
	 */
	
	public static void exercicio() {
		int valor = 1000;
		for(int i = 0; i <= valor; i++) {
			if(i%2 == 0) {
				System.out.println(i + " � par");
			}
		}
	}
	
	public static void main(String[] args) {
		exercicio();
	}
	
}
