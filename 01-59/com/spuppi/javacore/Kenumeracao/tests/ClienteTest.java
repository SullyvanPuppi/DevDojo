package com.spuppi.javacore.Kenumeracao.tests;

import com.spuppi.javacore.Kenumeracao.classes.Cliente;
import com.spuppi.javacore.Kenumeracao.classes.TipoCliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Anna", TipoCliente.PESSOA_FISICA);
		System.out.println(cliente);	
		
	}
	
}
