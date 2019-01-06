package com.spuppi.javacore.Hheranca.tests;

import com.spuppi.javacore.Hheranca.classes.Endereco;
import com.spuppi.javacore.Hheranca.classes.Funcionario;
import com.spuppi.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {

	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa();
		
		//pessoa.setNome("Gina");
		//pessoa.setCpf("111.222.333-44");
		
		Endereco end = new Endereco();
		end.setBairro("Campo Grande");
		end.setRua("Rua Carlos Gomes");
		
		//pessoa.setEndereco(end);
		//pessoa.imprimir();
		
		Funcionario f = new Funcionario();
		f.setNome("Augusto");
		f.setCpf("111.555.333-44");
		f.setSalario(15000);
		f.setEndereco(end);
		
		//f.imprimir();
	}

}
