package com.marcoslozina.challenge.sumaapi.converters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.actuate.trace.http.HttpTrace;

import com.marcoslozina.challenge.sumaapi.dtos.TraceDTO;
import com.marcoslozina.challenge.sumaapi.entity.Trace;

public class TraceConverter extends AbstractConverter<Trace, TraceDTO> {

	private String datetimeFormat = "dd/MM/yyyy hh:mm:ss";

	DateFormat dateFormat = new SimpleDateFormat(datetimeFormat);

	@Override
	public TraceDTO fromEntity(Trace entity) {
		if (entity == null)
			return null;
		return TraceDTO.builder().id(entity.getId()).method(entity.getMethod()).url(entity.getUrl())
				.date(dateFormat.format(entity.getDate())).build();
	}

	@Override
	public Trace fromDTO(TraceDTO dto) {
		if (dto == null)
			return null;
		try {
			return Trace.builder().id(dto.getId()).method(dto.getMethod()).url(dto.getUrl())
					.date(dateFormat.parse(dto.getDate())).build();
		} catch (ParseException e) {
			return Trace.builder().id(dto.getId()).method(dto.getMethod()).url(dto.getUrl()).date(null).build();
		}
	}

	public Trace fromHttpTrace(HttpTrace httpTrace) {
		if (httpTrace == null)
			return null;
		return Trace.builder().method(httpTrace.getRequest().getMethod())
				.url(httpTrace.getRequest().getUri().toString()).date(Date.from(httpTrace.getTimestamp())).build();
	}

}
