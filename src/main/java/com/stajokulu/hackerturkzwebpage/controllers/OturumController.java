package com.stajokulu.hackerturkzwebpage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stajokulu.hackerturkzwebpage.services.OturumService;

@Controller
public class OturumController {

	@Autowired
	private OturumService oturumService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
}