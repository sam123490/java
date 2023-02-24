package com.samrodriguez.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.samrodriguez.bookclub.models.LoginUser;
import com.samrodriguez.bookclub.models.User;
import com.samrodriguez.bookclub.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public User register(User newUser, BindingResult result) {
		if (result.hasErrors()) {
			return null;
		}
		
		Optional<User> u = userRepo.findByEmail(newUser.getEmail());
		if (u.isPresent()) {
			result.rejectValue("email", "email", "Email already used, please login.");
			return null;
		}
		
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "password", "Passwords do not match.");
			return null;
		}
		
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		return userRepo.save(newUser);
	}
	
	public User login(LoginUser newLogin, BindingResult result) {
		if (result.hasErrors()) {
			return null;
		}
		
		Optional<User> u = userRepo.findByEmail(newLogin.getEmail());
		if (!u.isPresent()) {
			result.rejectValue("email", "email", "Email does not exist.");
			return null;
		}
		
		User user = u.get();
		if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
			result.rejectValue("password", "Matches", "Wrong Password!");
			return null;
		}
		return user;
	}
	
	public List<User> getAll(){
		return userRepo.findAll();
	}
	
	public void createOrUpdate(User user) {
		userRepo.save(user);
	}
	
	public User getOne(Long id) {
		Optional<User> user = userRepo.findById(id);
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}
}
