package com.push.data;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.push.entity.User;

@Repository
public class Data {
	
	private static HashMap<Integer,User> data;
	
	static {
		data=new HashMap<Integer,User>(){
			{
				put(1, new User(1,"AJ","Vijay@gmail.com"));
				put(2, new User(2,"PK","Rakesh@gmail.com"));
				put(3, new User(3,"UD","Rahul@gmail.com"));
				put(4, new User(4,"ML","Honda@gmail.com"));
				
			}
			
		};
		
	}
	
	
	public Collection<User> getAll(){
		return this.data.values();
		
	}
		
		

	

}
