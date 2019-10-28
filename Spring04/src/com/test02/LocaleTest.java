package com.test02;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println("locale : " + locale);
		
		Locale[] res = Locale.getAvailableLocales();
		for(Locale l : res) {
			System.out.println(l.toString() + " \t" +
							l.getCountry() + "\t "+ l.getLanguage() +
							" \t "+ l.getDisplayName());
		}
		
		Locale.setDefault(new Locale("fr","FRANCE","MAC"));
		
		Locale.setDefault(new Locale("ko", "KOREA", "WIN"));
		
	}
}
