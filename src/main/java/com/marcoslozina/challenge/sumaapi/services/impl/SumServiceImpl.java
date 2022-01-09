package com.marcoslozina.challenge.sumaapi.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.marcoslozina.challenge.sumaapi.services.SumService;
import com.marcoslozina.challenge.sumaapi.utils.NumberFormatUtil;
import com.marcoslozina.challenge.sumaapi.validators.SumValidator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SumServiceImpl implements SumService {

	NumberFormatUtil numberFormatUtil;

	@Override
	public String sumValues(String... numbers) {
		SumValidator.sum(numbers);
		Double result = 0d;
		List<Double> numberList = getNumbers(numbers);
		for (Double number : numberList) {
			result = Double.sum(result, number);
		}
		return numberFormatUtil.formatOutputES(result);
	}

	private List<Double> getNumbers(String... numbers) {
		List<Double> valueList = new ArrayList<Double>();
		numberFormatUtil = new NumberFormatUtil();
		for (String number : numbers) {
			valueList.add(Double.parseDouble(numberFormatUtil.formatInputES(number)));
		}
		return valueList;
	}

}
