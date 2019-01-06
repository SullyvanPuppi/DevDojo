package com.spuppi.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("Gerando relatório de pagamento Funcionário");
		funcionario.calcularPagamento();
		System.out.println("Nome " + funcionario.getNome());
		System.out.println("Salario " + funcionario.getSalario());
		if(funcionario instanceof Gerente) {
			Gerente g = (Gerente) funcionario;
			System.out.println("Participação nos lucros: " + g.getPnl());
		}
		if(funcionario instanceof Vendedor) {
			System.out.println("Total de vendas " + ((Vendedor) funcionario).getTotalVenda());
		}
	}
	
}
