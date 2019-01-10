package com.spuppi.javacore.Oexception.checkedexception.classes;

public class Leitor2 implements AutoCloseable{
	
	@Override
	public void close() {
		System.out.println("Fechando leitor2!");
	}

}
