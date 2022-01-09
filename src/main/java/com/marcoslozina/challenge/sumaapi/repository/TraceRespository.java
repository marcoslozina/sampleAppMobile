package com.marcoslozina.challenge.sumaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcoslozina.challenge.sumaapi.entity.Trace;

@Repository
public interface TraceRespository extends JpaRepository<Trace, Long> {

}
