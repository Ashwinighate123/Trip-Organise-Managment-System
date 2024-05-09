package com.model.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.model.Booking;

import com.model.service.BookingService;


@CrossOrigin("http://localhost:4200/")
@RestController
public class BookingController {
	@Autowired
	BookingService service;
@GetMapping("/getAllBookings")
	
	public List<Booking> getAllBookings(){
		return service.getAllBookings();
	}
	
	@PostMapping("/addBooking")
	public Booking addBooking(@RequestBody Booking r){
		 System.out.println("Received booking: " + r);
		return service.saveBooking(r);
	}

	@GetMapping("/getbyemailandpassword/{email}")
	public Optional<Booking> getByEmailAndPassword(@PathVariable String email){
		Optional<Booking> t= service.getByEmailAndPassword(email);
		System.out.println(t);
		return t;
		
	}
}