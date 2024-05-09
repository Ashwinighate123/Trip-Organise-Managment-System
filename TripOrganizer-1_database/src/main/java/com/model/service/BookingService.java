package com.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.model.Booking;
import com.model.repo.BookingRepo;

@Service
public class BookingService {
    @Autowired
    BookingRepo repo;

    public List<Booking> getAllBookings(){
	    return repo.findAll();
	}
	public Booking saveBooking(Booking r){
		return repo.save(r);		
	}
	
	public Optional<Booking> getByEmailAndPassword(String email){
		return repo.getByEmailAndPassword(email);
	}


}
