package com.marcoslozina.challenge.sumaapi.services;

import com.marcoslozina.challenge.sumaapi.dtos.LoginRequestDTO;
import com.marcoslozina.challenge.sumaapi.dtos.LoginResponseDTO;
import com.marcoslozina.challenge.sumaapi.entity.User;

public interface UserService {

	public User createUser(User user);

	public LoginResponseDTO login(LoginRequestDTO request);

	public String createToken(User user);

	public boolean validateToken(String token);

	public String getUsernameFromToken(String jwt);

}
