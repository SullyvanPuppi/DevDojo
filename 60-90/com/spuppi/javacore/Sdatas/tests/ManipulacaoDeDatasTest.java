package com.spuppi.javacore.Sdatas.tests;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.getTime());
		
		
		Calendar c = Calendar.getInstance();
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
			System.out.println("Domingo é o primeirio dia da semana");	
		}
		
		
		

	}

}
