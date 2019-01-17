package com.spuppi.javacore.Oexception.checkedexception.tests;

import com.spuppi.javacore.Oexception.checkedexception.classes.Funcionario;
import com.spuppi.javacore.Oexception.customexceptions.tests.LoginInvalidoException;

public class SobrescritaComExceptionsTest {

	public static void main(String[] args) throws LoginInvalidoException {
		Funcionario f = new Funcionario();
		//Pessoa p = new Pessoa();
		
		f.salvar();
	}

}
