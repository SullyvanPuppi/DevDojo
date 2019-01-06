package com.spuppi.javacore.Fmodificadorestatico.classes;

import com.spuppi.javacore.Fmodificadorestatico.tests.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		for(int parcela : cliente.getNumParcelas()) {
			System.out.println(parcela + " ");
		}

	}

}
