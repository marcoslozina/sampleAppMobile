package com.marcoslozina.challenge.sumaapi.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.marcoslozina.challenge.sumaapi.services.impl.TraceServiceImpl;

@Configuration
public class SpringActuatorConfiguration {

	@Autowired
	private TraceServiceImpl traceService;

	@Bean
	public HttpTraceRepository httpTraceRepository() {
		return new InMemoryHttpTraceRepository() {
			ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
			Logger logger = LoggerFactory.getLogger(InMemoryHttpTraceRepository.class);

			@Override
			public void add(HttpTrace httpTrace) {
				traceService.create(httpTrace);
				super.add(httpTrace);
			}

		};
	}
}