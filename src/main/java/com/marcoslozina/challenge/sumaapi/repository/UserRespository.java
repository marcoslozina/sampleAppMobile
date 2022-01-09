package com.marcoslozina.challenge.sumaapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcoslozina.challenge.sumaapi.entity.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {

	public Optional<User> findByUsername(String username);
}
