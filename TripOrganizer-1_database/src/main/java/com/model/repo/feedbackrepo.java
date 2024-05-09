package com.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.model.feedback;

@Repository
public interface feedbackrepo extends JpaRepository<feedback,Integer>{

}
