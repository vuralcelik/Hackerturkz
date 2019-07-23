package com.stajokulu.hackerturkzwebpage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stajokulu.hackerturkzwebpage.services.IndexService;

@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String showLoginPage() {
		return "index";
	}
	
}
