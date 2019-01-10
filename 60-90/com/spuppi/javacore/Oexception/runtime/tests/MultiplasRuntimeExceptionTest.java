package com.spuppi.javacore.Oexception.runtime.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {

	public static void main(String[] args) {
	
		try {
			throw new RuntimeException();
		} catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Dentro do múltiplo catch.");
		}

		try {
			talvezLanceException();
		}catch(SQLException | IOException e){
			
		}

	}
	
	public static void talvezLanceException() throws SQLException, FileNotFoundException{
		
	}

}
