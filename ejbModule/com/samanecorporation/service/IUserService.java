package com.samanecorporation.service;

import java.util.Optional;

import com.samanecorporation.dto.UserDTO;

import jakarta.ejb.Local;

@Local
public interface IUserService {
	public Optional<UserDTO> login (String email ,String password);

}

