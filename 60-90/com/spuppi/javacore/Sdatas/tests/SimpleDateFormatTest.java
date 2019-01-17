package com.spuppi.javacore.Sdatas.tests;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z";
		SimpleDateFormat sdf = new SimpleDateFormat(mascara);
		
		System.out.println(sdf.format(c.getTime()));

	}

}
