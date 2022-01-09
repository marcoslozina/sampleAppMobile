package com.marcoslozina.challenge.sumaapi.utils;

public class NumberFormatUtil {

	public String formatInputES(String number) {
		return number.replaceAll(",", ".");
	}

	public String formatOutputES(Double number) {
		return String.format("%,.2f", number);
	}

	public String formatUS(String number) {
		return number.replaceAll(".", ",");
	}
}
