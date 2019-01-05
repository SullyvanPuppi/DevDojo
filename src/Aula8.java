
public class Aula8 {

	/*
	 * Operadores Lógicos
	 * 
	 * 
	 */
	
	public static void operadoresLogicos() {
		int idade = 18;
		float salario = 1000f;
		
		boolean operadorE = idade >= 18 && salario >= 1000;
		boolean operadorOu = idade >= 18 || salario >= 1000;
		
		System.out.println(operadorOu);
	}
	
	public static void main(String[] args) {
		operadoresLogicos();
	}
	
}
