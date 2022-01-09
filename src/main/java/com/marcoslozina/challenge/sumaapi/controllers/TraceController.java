package com.marcoslozina.challenge.sumaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marcoslozina.challenge.sumaapi.converters.TraceConverter;
import com.marcoslozina.challenge.sumaapi.dtos.TraceDTO;
import com.marcoslozina.challenge.sumaapi.entity.Trace;
import com.marcoslozina.challenge.sumaapi.services.impl.TraceServiceImpl;
import com.marcoslozina.challenge.sumaapi.utils.WrapperResponse;

@RestController
public class TraceController {

	@Autowired
	private TraceServiceImpl traceService;

	@Autowired
	private TraceConverter traceConverter;

	@GetMapping(value = "/traces")
	public ResponseEntity<List<TraceDTO>> findAll(
			@RequestParam(value = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(value = "pageSize", required = false, defaultValue = "5") int pageSize) {

		Pageable page = PageRequest.of(pageNumber, pageSize);
		List<Trace> traces = traceService.findAll(page);
		List<TraceDTO> dtoTraces = traceConverter.fromEntity(traces);

		return new WrapperResponse(true, "success", dtoTraces).createResponse(HttpStatus.OK);
	}

}
