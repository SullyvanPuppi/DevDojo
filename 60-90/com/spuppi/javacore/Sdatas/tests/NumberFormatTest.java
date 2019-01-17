package com.spuppi.javacore.Sdatas.tests;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		float valor = 123.4567f;
		Locale locIt = new Locale("fr");

		NumberFormat[] nf = new NumberFormat[4];
		
		nf[0] = NumberFormat.getInstance();
		nf[1] = NumberFormat.getInstance(locIt);
		nf[2] = NumberFormat.getCurrencyInstance();
		nf[3] = NumberFormat.getCurrencyInstance(locIt);
		
		for(NumberFormat nfs : nf) {
			System.out.println(nfs.format(valor));
		}
		
		String valorString = "123.4567f";
		try {
			System.out.println(nf[0].parse(valorString));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
