
public class Aula6 {

	/*
	 * Tipos de variáveis
	 * 
	 * 
	 * Operadores
	 * 
	 * ++ Increment
	 * -- Decrement
	 * + Plus
	 * - Minus
	 * () Cast
	 * ! Not 
	 * 
	 * */

	public static void ExemploVariaveis() {
		int idade = 10;
		double salarioDouble = 3000;
		float salarioFloat = 3000;
		byte idadeByte = 12;
		short idadeShort = 32767;
		boolean falso = false;
		long numeroGrande = 1000L;
		char caractere = '\u0041';
		String nome = "Sullyvan";

		System.out.println(nome);
	}

	public static void ExercicioAula1(String nome, String endereco, String telefone) {
		System.out.println("O " + nome + " domiciliado no endereço " + endereco + " e telefone " + telefone + " não possui nenhum tipo de pendência.");

	}
	
	public static void ExercicioAula2(String nome, double salario, char sexo, int idade, String estadoCivil) {
		System.out.println("O trabalhador " + nome + " do sexo " + sexo + ", idade " + idade + ", estado civil " + 
				estadoCivil + " e salário " + salario + " encontra-se empregado neste estabelecimento.");
	}
	
	public static void ExemploAulaOperadores() {
		int numero1 = 10;
		int numero2 = 20;
		
		System.out.println(numero1 + numero2);
	}

	public static void main(String[] args) {
		ExemploAulaOperadores();
	}

}
