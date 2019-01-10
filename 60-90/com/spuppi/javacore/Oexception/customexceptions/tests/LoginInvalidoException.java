package com.spuppi.javacore.Oexception.customexceptions.tests;

@SuppressWarnings("serial")
public class LoginInvalidoException extends Exception{
	
	public LoginInvalidoException() {
		super("Usuário ou senha inválidos!");
	}
	
	public static void main(String[] args) {
		
	}
	
	public static void logar() throws LoginInvalidoException{
		String usuarioBancoDeDados = "LoroJose";
		String senhaBancoDeDados = "haduken";
		String usuarioDigitado = "LoroJose";
		String senhaDigitado = "shoriuken";
		if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitado)) {
			throw new LoginInvalidoException();
		}else {
			System.out.println("Logado");
		}
	}

}
