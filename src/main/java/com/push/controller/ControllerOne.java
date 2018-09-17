package com.push.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.push.entity.User;
import com.push.service.UserService;



@RestController    
public class ControllerOne {
	
	@Autowired
	private UserService userser;

	@GetMapping(path="/")
	public Collection<User> show() {
		return userser.getAll();
		}
	
	

}