
public class Aula9 {

	/*
	 * Operadores
	 * 
	 * =, -=, +=, *=, /=, %=
	 * 
	 */
	
	public static void operadoresAtribuicao() {
		int salario = 1800;
		
		System.out.println(salario+=1000);
		System.out.println(salario/=3);
	}
	
	public static void main(String[] args) {
		operadoresAtribuicao();
	}
}
