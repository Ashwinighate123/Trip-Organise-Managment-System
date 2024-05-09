package com.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.model.feedback;
import com.model.repo.feedbackrepo;

@Service
public class feedbackservice {
@Autowired
feedbackrepo repo;

public List<feedback>getAllUsers(){
	return (List<feedback>) repo.findAll();
	
}
//public Optional<feedback>getUser(String Name){
//	return (Optional<feedback>) repo.findById(Name);
//	
//}

public feedback addfeedback(feedback f){
	return repo.save(f);
}

}
