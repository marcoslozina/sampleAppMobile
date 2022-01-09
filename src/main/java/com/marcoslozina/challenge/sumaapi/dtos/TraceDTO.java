package com.marcoslozina.challenge.sumaapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TraceDTO {
	private Long id;
	private String method;
	private String url;
	private String date;

}
