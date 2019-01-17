package com.spuppi.javacore.Sdatas.tests;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		//Utliza norma ISO 639
		Locale locale1 = new Locale("it");
		Locale locale2 = new Locale("it","CH");
		Locale locale3 = new Locale("hi","IN");
		Locale locale4 = new Locale("ja");
		
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.DECEMBER, 23);
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale1);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locale3);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locale4);
		
		System.out.println("Itália: " + df1.format(c.getTime()));
		System.out.println("Suiça: " + df2.format(c.getTime()));
		System.out.println("Indía: " + df3.format(c.getTime()));
		System.out.println("Japão: " + df4.format(c.getTime()));
		
		System.out.println(locale4.getDisplayLanguage(locale2));
		System.out.println(locale2.getDisplayCountry(locale4));
	}

}
