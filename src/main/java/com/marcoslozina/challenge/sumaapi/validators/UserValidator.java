package com.marcoslozina.challenge.sumaapi.validators;

import com.marcoslozina.challenge.sumaapi.entity.User;
import com.marcoslozina.challenge.sumaapi.exceptions.ValidateServiceException;

public class UserValidator {

	public static void signup(User user) {
		if (user.getUsername() == null || user.getUsername().trim().isEmpty()) {
			throw new ValidateServiceException("El nombre de usuario es requerido");
		}

		if (user.getUsername().length() > 30) {
			throw new ValidateServiceException("El nombre de usuario es muy largo (max 30)");
		}

		if (user.getPassword() == null || user.getPassword().isEmpty()) {
			throw new ValidateServiceException("El password de usuario es requerido");
		}

		if (user.getPassword().length() > 30) {
			throw new ValidateServiceException("El password de usuario es muy largo (max 30)");
		}
	}
}
