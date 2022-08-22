package com.bezkoder.spring.login.service;

import java.io.IOException;
import java.util.List;

import com.bezkoder.spring.login.models.User;

public interface UserService {
	List<User> getAll();

    User getUserById(Long id);
    
    User Update(User user);
    
    void delete(Long id) throws IOException;
}
