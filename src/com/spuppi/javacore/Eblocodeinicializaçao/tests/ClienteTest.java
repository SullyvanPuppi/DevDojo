package com.spuppi.javacore.Eblocodeinicializašao.tests;

import com.spuppi.javacore.Eblocodeinicializašao.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		for(int parcela : cliente.getNumParcelas()) {
			System.out.println(parcela + " ");
		}

	}

}
