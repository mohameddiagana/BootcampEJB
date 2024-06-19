package com.samanecorporation.service;

import java.util.Optional;

import com.samanecorporation.dto.UserDTO;

import jakarta.ejb.Stateless;
@Stateless
public class UserServiceImpl implements IUserService {

	@Override
	public Optional<UserDTO> login(String email, String password) {
		if(email.equals("diag@gmail.com") && password.equals("passer")) {
			return Optional.of(new UserDTO(1, "diag@gmail.com","passer"));
			
		}
		
		return Optional.empty();
	}

}

