package com.chat.dto;

import com.chat.entity.UserEntity;

public class LoginDTO {
	
	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserEntity convertToEntity(LoginDTO loginDTO) {
		UserEntity userEntity = new UserEntity();
		userEntity.setUsername(loginDTO.getUsername());
		userEntity.setPassword(loginDTO.getPassword());
		return userEntity;
	}

}
