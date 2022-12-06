package com.HurricaneDatabase.demo.service;

import com.HurricaneDatabase.demo.model.User;
import com.HurricaneDatabase.demo.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {
    @Autowired
    private userRepo user ;

    @Override
    public List<User> getAll() {
       
        return user.findAll();
    }

    @Override
    public List<User> checkUser(String username, String password) {
    
        return user.verifyUser(username, password);
    }
    
}
