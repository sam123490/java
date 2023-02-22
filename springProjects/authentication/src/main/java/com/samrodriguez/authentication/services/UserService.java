package com.samrodriguez.authentication.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.samrodriguez.authentication.models.LoginUser;
import com.samrodriguez.authentication.models.User;
import com.samrodriguez.authentication.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public User register(User newUser, BindingResult result) {
		if(result.hasErrors()) {
			return null;
		}
		
		Optional<User> u = userRepo.findByEmail(newUser.getEmail());
		if (u.isPresent()) {
			result.rejectValue("email", "email", "Email already used, please login.");
			return null;
		}
//		lol the method above is way more efficient =)
//		List<User> allUsers = getAll();
//		for (int i = 0; i < allUsers.size(); i++) {
//			if(allUsers.get(i).getEmail() == newUser.getEmail()) {
//				return null;
//			}
//		}
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "password", "Passwords must match.");
			return null;
		}
		
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		return userRepo.save(newUser);
	}
	
	public User login(LoginUser newLoginObject, BindingResult result) {
		if(result.hasErrors()) {
			return null;
		}
		
		Optional<User> u = userRepo.findByEmail(newLoginObject.getEmail());
		if(!u.isPresent()) {
			result.rejectValue("email", "email", "Email does not exist.");
			return null;
		}
		User user = u.get();
		if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
		    result.rejectValue("password", "Matches", "Invalid Password!");
		    return null;
		}
		return user;
	}
	
	public List<User> getAll(){
		return userRepo.findAll();
	}
	
	public User getOne(Long id) {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}
	
	public void createOrUpdate(User u) {
		userRepo.save(u);
	}
}
