package com.marcoslozina.challenge.sumaapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marcoslozina.challenge.sumaapi.converters.UserConverter;
import com.marcoslozina.challenge.sumaapi.dtos.LoginRequestDTO;
import com.marcoslozina.challenge.sumaapi.dtos.LoginResponseDTO;
import com.marcoslozina.challenge.sumaapi.dtos.SignupRequestDTO;
import com.marcoslozina.challenge.sumaapi.dtos.UserDTO;
import com.marcoslozina.challenge.sumaapi.entity.User;
import com.marcoslozina.challenge.sumaapi.services.impl.UserServiceImpl;
import com.marcoslozina.challenge.sumaapi.utils.WrapperResponse;

@RestController
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private UserConverter userConverter;

	@PostMapping(value = "/signup")
	public ResponseEntity<WrapperResponse<UserDTO>> signup(@RequestBody SignupRequestDTO request) {
		User user = userService.createUser(userConverter.signup(request));
		return new WrapperResponse<>(true, "success", userConverter.fromEntity(user)).createResponse();
	}

	@PostMapping(value = "/login")
	public ResponseEntity<WrapperResponse<LoginResponseDTO>> login(@RequestBody LoginRequestDTO request) {
		LoginResponseDTO response = userService.login(request);
		return new WrapperResponse<>(true, "success", response).createResponse();
	}
}
