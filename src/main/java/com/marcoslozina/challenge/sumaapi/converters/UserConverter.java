package com.marcoslozina.challenge.sumaapi.converters;

import com.marcoslozina.challenge.sumaapi.dtos.SignupRequestDTO;
import com.marcoslozina.challenge.sumaapi.dtos.UserDTO;
import com.marcoslozina.challenge.sumaapi.entity.User;

public class UserConverter extends AbstractConverter<User, UserDTO> {

	@Override
	public UserDTO fromEntity(User entity) {
		if (entity == null)
			return null;
		return UserDTO.builder().id(entity.getId()).username(entity.getUsername()).build();
	}

	@Override
	public User fromDTO(UserDTO dto) {
		if (dto == null)
			return null;
		return User.builder().id(dto.getId()).username(dto.getUsername()).build();
	}

	public User signup(SignupRequestDTO dto) {
		if (dto == null)
			return null;
		return User.builder().username(dto.getUsername()).password(dto.getPassword()).build();
	}
}
