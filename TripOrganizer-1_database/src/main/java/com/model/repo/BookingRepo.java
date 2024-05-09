package com.model.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.model.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {
	@Query(value = "SELECT r from Booking r where r.email=:email")
	Optional<Booking> getByEmailAndPassword(String email);
}
