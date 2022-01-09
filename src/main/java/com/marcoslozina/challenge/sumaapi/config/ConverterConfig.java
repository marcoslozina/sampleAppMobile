package com.marcoslozina.challenge.sumaapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.marcoslozina.challenge.sumaapi.converters.TraceConverter;
import com.marcoslozina.challenge.sumaapi.converters.UserConverter;

@Configuration
public class ConverterConfig {

	@Value("${config.datetimeFormat}")
	private String datetimeFormat;

	@Bean
	public UserConverter getUserConverter() {
		return new UserConverter();
	}

	@Bean
	public TraceConverter getTraceConverter() {
		return new TraceConverter();
	}
}
