package com.chat.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.dto.LoginDTO;
import com.chat.entity.UserEntity;
import com.chat.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String login(LoginDTO loginDTO) {
		Optional<UserEntity> userEntity = userRepository.findByUsername(loginDTO.getUsername());
		if(userEntity.isPresent()) {
			if(userEntity.get().getPassword().equals(loginDTO.getPassword())){
				return "success";
			}
			return "password mismatch";
		}
		else {
			userRepository.save(loginDTO.convertToEntity(loginDTO));
			return "success";
		}
	}
	
}
