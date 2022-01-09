package com.marcoslozina.challenge.sumaapi.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.marcoslozina.challenge.sumaapi.converters.TraceConverter;
import com.marcoslozina.challenge.sumaapi.entity.Trace;
import com.marcoslozina.challenge.sumaapi.repository.TraceRespository;
import com.marcoslozina.challenge.sumaapi.services.TraceService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TraceServiceImpl implements TraceService {

	@Autowired
	TraceRespository traceRespository;

	@Autowired
	private TraceConverter traceConverter;

	@Override
	public List<Trace> findAll(Pageable pageable) {
		return traceRespository.findAll(pageable).toList();
	}

	@Override
	public Trace create(HttpTrace httpTrace) {
		Trace trace = traceConverter.fromHttpTrace(httpTrace);
		if (isUrlToTrack(trace)) {
			return traceRespository.save(trace);
		}
		return null;
	}
	//!trace.getUrl().equals("http://localhost:8081/api/v1/")
	private boolean isUrlToTrack(Trace trace) {
		return !trace.getUrl().contains("traces") && !trace.getUrl().contains("swagger")
				&& !trace.getUrl().contains("api-docs")
				&& !trace.getUrl().contains("webjars");
	}

}
