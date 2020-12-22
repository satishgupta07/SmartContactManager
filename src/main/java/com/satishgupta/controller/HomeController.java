package com.satishgupta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.satishgupta.dao.UserRepository;
import com.satishgupta.entities.Contact;
import com.satishgupta.entities.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		User user = new User();
		user.setName("Satish Gupta");
		user.setEmail("satish@dev.io");
		
		Contact contact = new Contact();
		
		user.getContacts().add(contact);
		
		userRepository.save(user);
		
		return "Working";
	}
}
