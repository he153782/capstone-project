package com.bezkoder.spring.login.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users",
       uniqueConstraints = {
           @UniqueConstraint(columnNames = "username"),
           @UniqueConstraint(columnNames = "email")
       })
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 120)
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
  
  
  
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "user_roles", 
             joinColumns = @JoinColumn(name = "user_id"),
             inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles = new HashSet<>();

  public User() {
  }

  public User(String username, String email, String password, String fullname,String weight, String height, String gender, String birthday ) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.fullname = fullname;
    this.weight = weight;
    this.height = height;
    this.gender = gender;
    this.birthday = birthday;
   
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
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
