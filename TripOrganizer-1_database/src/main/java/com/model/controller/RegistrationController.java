package com.model.controller;

import java.util.List;
import java.util.Optional;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.service.RegistrationService;

import com.model.model.registration;
@CrossOrigin("http://localhost:4200/")
@RestController
public class RegistrationController {
	@Autowired
	RegistrationService service;
	
	@GetMapping("/getAllUsers")
	
	public List<registration> getAllUsers(){
		return service.getAllUsers();
	}
	
	@PostMapping("/addUser")
	public registration addUser(@RequestBody registration r){
		return service.saveUser(r);
	}

	@GetMapping("/getbyemailandpassword/{email}/{pass}")
	public Optional<registration> getByEmailAndPassword(@PathVariable String email,@PathVariable String pass){
		Optional<registration> t= service.getByEmailAndPassword(email, pass);
		System.out.println(t);
		return t;
		
	}
}












