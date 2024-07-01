package com.sideproject.ineedtodo.dto;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

public class LoginResponse {

    String jwtToken;
    UserDetails user;
    List<String> roles;
    
	public LoginResponse(String jwtToken, UserDetails user, List<String> roles) {
		this.jwtToken = jwtToken;
		this.user = user;
		this.roles = roles;
	}
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public UserDetails getUsername() {
		return user;
	}
	public void setUsername(UserDetails user) {
		this.user = user;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
}
