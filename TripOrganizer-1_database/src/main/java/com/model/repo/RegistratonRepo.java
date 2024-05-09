package com.model.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.model.registration;

@Repository
public interface RegistratonRepo extends JpaRepository<registration, Integer> {
	@Query(value = "SELECT r from registration r where r.email=:email and r.password=:pass")
	Optional<registration> getByEmailAndPassword(String email,String pass);
}
