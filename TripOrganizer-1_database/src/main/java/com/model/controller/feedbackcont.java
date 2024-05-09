package com.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.model.feedback;
import com.model.service.feedbackservice;

@RestController
@CrossOrigin("http://localhost:4200")
public class feedbackcont {

    @Autowired
    feedbackservice service;

    @GetMapping("/getAllFeedback")
    public List<feedback> getAllFeedback() {
        List<feedback> lst = service.getAllUsers();
        System.out.println("got data=" + lst);
        return lst;
    }

    @PostMapping("/addFeedback")
    public feedback addFeedback(@RequestBody feedback feedback) {
        System.out.println(feedback);
        return service.addfeedback(feedback);
    }
}
