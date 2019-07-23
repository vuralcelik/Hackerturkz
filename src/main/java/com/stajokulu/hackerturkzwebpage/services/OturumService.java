package com.stajokulu.hackerturkzwebpage.services;

import org.springframework.stereotype.Service;

@Service
public class OturumService {
	
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("in28Minutes") && password.equals("dummy");
	}

}