package com.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.model.repo.RegistratonRepo;
import com.model.model.registration;

@Service
public class RegistrationService {
	@Autowired
	RegistratonRepo repo;
	
	public List<registration> getAllUsers(){
	    return repo.findAll();
	}
	public registration saveUser(registration r){
		return repo.save(r);		
	}
	
	public Optional<registration> getByEmailAndPassword(String email,String pass){
		return repo.getByEmailAndPassword(email, pass);
	}


}
