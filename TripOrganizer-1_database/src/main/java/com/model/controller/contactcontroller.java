package com.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.model.contact;
import com.model.service.contactservice;

@RestController
@CrossOrigin("http://localhost:4200")
public class contactcontroller {

	    @Autowired
	    private contactservice service;

	    @GetMapping("/getAllContacts")
	    public List<contact> getAllContacts() {
	        List<contact> lst = service.getAllUsers();
	        System.out.println("got data=" + lst);
	        return lst;
	    }

	    @PostMapping("/addContact")
	    public contact addContact(@RequestBody contact contact) {
	        System.out.println(contact);
	        return service.addcontact(contact);
	    }
	}
