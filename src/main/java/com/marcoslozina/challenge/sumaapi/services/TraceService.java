package com.marcoslozina.challenge.sumaapi.services;

import java.util.List;

import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.data.domain.Pageable;

import com.marcoslozina.challenge.sumaapi.entity.Trace;

public interface TraceService {

	public Trace create(HttpTrace httpTrace);

	public List<Trace> findAll(Pageable pageable);

}
