package com.spuppi.javacore.Eblocodeinicializa�ao.tests;

import com.spuppi.javacore.Eblocodeinicializa�ao.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		for(int parcela : cliente.getNumParcelas()) {
			System.out.println(parcela + " ");
		}

	}

}
