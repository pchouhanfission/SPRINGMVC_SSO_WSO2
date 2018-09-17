package com.push.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.push.data.Data;
import com.push.entity.User;

@Service
public class UserService {
	
	@Autowired
	private Data dd;
	
	public Collection<User> getAll() {
		return dd.getAll(); 
	}
}
