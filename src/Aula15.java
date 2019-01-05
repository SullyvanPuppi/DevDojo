
public class Aula15 {

	/*
	 * Controle de Fluxo com While, doWhile e For
	 * 
	 * 
	 */
	
	
	public static void controleWhile() {
		int contador = 0;
		
		while(contador < 10) {
			System.out.println(++contador);
		}
	}
	
	public static void controleDoWhile() {
		int contador = 0;
			
		do{
			System.out.println(++contador);
		}while(contador < 10);
		
	}
	
	public static void controleFor() {
		int contador = 0;
		
		for(int i = 0; i <10; i++) {
			System.out.println(++contador);
		}		
	}
	
	public static void main(String[] args) {
		controleFor();
	}
	
}
