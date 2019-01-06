package com.spuppi.javacore.Eblocodeinicializaçao.tests;

import com.spuppi.javacore.Eblocodeinicializaçao.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		for(int parcela : cliente.getNumParcelas()) {
			System.out.println(parcela + " ");
		}

	}

}
