package com.HurricaneDatabase.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.HurricaneDatabase.demo.model.User;
import com.HurricaneDatabase.demo.service.userService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class runQueries {
    @Autowired
	private userService user;

    public List<User> getUsers(String username, String pass){
        return user.getAll();
    }
}
