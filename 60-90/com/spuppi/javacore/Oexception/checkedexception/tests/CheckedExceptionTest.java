package com.spuppi.javacore.Oexception.checkedexception.tests;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		try {
			abrirArquivo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void criarArquivo() throws IOException{
		File file = new File("C:\\temp\\Teste.txt");
		try {
			file.createNewFile();
			System.out.println("Arquivo criado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void abrirArquivo() {
		try {
			
		}catch(Exception e){
			
		}
		finally {
			System.out.println("Sempre será executado mesmo se entrar no catch");
		}
	}

}
