package com.bezkoder.spring.login.payload.request;

import java.util.Set;

import javax.validation.constraints.*;
 
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
 
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
    
    @NotBlank
    @Size(max = 120)
    private String fullname;
    
    @NotBlank
    @Size(max = 120)
    private String weight;
    
    @NotBlank
    @Size(max = 120)
    private String height;
    
    @NotBlank
    @Size(max = 120)
    private String gender;
    
    @NotBlank
    @Size(max = 120)
    private String birthday;
    
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<String> getRole() {
      return this.role;
    }
    
    public void setRole(Set<String> role) {
      this.role = role;
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
}
