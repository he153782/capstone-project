package com.bezkoder.spring.login.payload.response;

import java.util.List;

public class UserInfoResponse {
	private Long id;
	private String username;
	private String email;
	private String fullname;
	private String weight;
	private String height;
	private String gender;
	private String birthday;
	private String token;
	private List<String> roles;

	public UserInfoResponse(Long id, String username, String email, String fullname, String weight,String height, String gender, String birthday,String token, List<String> roles) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.fullname = fullname;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.birthday = birthday;
		this.token = token;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getRoles() {
		return roles;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
