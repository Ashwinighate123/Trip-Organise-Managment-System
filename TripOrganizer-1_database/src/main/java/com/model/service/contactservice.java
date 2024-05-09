package com.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.model.contact;
import com.model.repo.contactrepo;

@Service
public class contactservice {
	@Autowired
contactrepo repo;

	public List<contact>getAllUsers(){
		return (List<contact>) repo.findAll();
		
	}
	//public Optional<feedback>getUser(String Name){
//		return (Optional<feedback>) repo.findById(Name);
	//	
	//}

	public contact addcontact(contact f){
		return repo.save(f);
	}
}
