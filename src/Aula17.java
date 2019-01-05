
public class Aula17 {

	/*
	 * Controle de fluxo
	 * Comando break e continue
	 * 
	 */
	
	public static void controleBreak() {
		double valorTotal = 30000;
		int parcelaMinima = 1000;
		
		for(int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela;
			if(valorParcela >= parcelaMinima) {
				System.out.println("O carro pode ser pago em " + parcela + " de R$ " + valorParcela);
			}else {
				break;					
			}						
		}
	} 
	
	public static void controleContinue() {
		double valorTotal = 30000;
		int parcelaMinima = 1000;
		
		for(int parcela = (int) valorTotal; parcela >= 1; parcela--) {
			double valorParcela = valorTotal / parcela;
			
			if(valorParcela < parcelaMinima) {
					continue;
			}
			System.out.println("O carro pode ser pago em " + parcela + " de R$ " + valorParcela);			
		}
	} 
	
	public static void main(String[] args) {
		controleContinue();
	}
	
}
