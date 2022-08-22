package com.bezkoder.spring.login.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.login.models.User;
import com.bezkoder.spring.login.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User Update(User user) {
		User exitUser = userRepository.findById(user.getId()).orElse(null);
		exitUser.setUsername(user.getUsername());
		exitUser.setEmail(user.getEmail());
		exitUser.setPassword(user.getPassword());
		exitUser.setFullname(user.getFullname());
		exitUser.setWeight(user.getWeight());
		exitUser.setHeight(user.getHeight());
		exitUser.setGender(user.getGender());
		exitUser.setBirthday(user.getBirthday());
		return userRepository.save(exitUser);
	}

	@Override
	public void delete(Long id) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
