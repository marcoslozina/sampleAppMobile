package com.marcoslozina.challenge.sumaapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marcoslozina.challenge.sumaapi.services.impl.SumServiceImpl;
import com.marcoslozina.challenge.sumaapi.utils.WrapperResponse;

@RestController
public class SumRestController {

	@Autowired
	SumServiceImpl sumService;

	@GetMapping(value = "/sum")
	public ResponseEntity<String> sumValues(@RequestParam("value1") String value1,
			@RequestParam("value2") String value2) {

		return new WrapperResponse(true, "success", sumService.sumValues(value1, value2)).createResponse(HttpStatus.OK);
	}
}
