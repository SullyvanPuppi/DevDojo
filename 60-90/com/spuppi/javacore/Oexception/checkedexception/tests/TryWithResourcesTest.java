package com.spuppi.javacore.Oexception.checkedexception.tests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.spuppi.javacore.Oexception.checkedexception.classes.Leitor1;
import com.spuppi.javacore.Oexception.checkedexception.classes.Leitor2;

public class TryWithResourcesTest {

	public static void main(String[] args) {
		lerArquivo();
	}

	public static void lerArquivo() {
		
		try (Leitor1 leitor1 = new Leitor1();
				Leitor2 leitor2 = new Leitor2()){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try(Reader reader = new BufferedReader(new FileReader("C:\\temp\\Teste.txt"))){
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
		
	}
	
	public static void lerArquivoOld() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("C:\\temp\\Teste.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
