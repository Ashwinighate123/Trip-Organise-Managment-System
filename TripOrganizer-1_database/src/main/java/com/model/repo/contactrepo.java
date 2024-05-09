package com.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.model.contact;

@Repository
public interface contactrepo extends JpaRepository<contact,Integer> {

}