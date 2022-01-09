package com.marcoslozina.challenge.sumaapi.validators;

import com.marcoslozina.challenge.sumaapi.exceptions.ValidateServiceException;
import com.marcoslozina.challenge.sumaapi.utils.NumberFormatUtil;

public class SumValidator {

	static NumberFormatUtil numberFormatUtil;

	public static void sum(String... numbers) {
		numberFormatUtil = new NumberFormatUtil();
		for (String number : numbers) {
			try {
				Double.parseDouble(numberFormatUtil.formatInputES(number));
			} catch (NumberFormatException e) {
				throw new ValidateServiceException(
						"El valor ingresado: ".concat(number).concat(" no es un número válido."));

			}

		}
	}

}
