package com.spuppi.javacore.Npolimorfismo.classes;

public class DataBaseDAO implements iDAO{

	@Override
	public void save() {
		System.out.println("Salvando dados no Banco de Dados.");
	}

}
