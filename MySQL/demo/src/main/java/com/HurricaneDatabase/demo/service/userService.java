package com.HurricaneDatabase.demo.service;

import com.HurricaneDatabase.demo.model.User;
import java.util.List;

public interface userService {
    public List<User> getAll();
    public List<User> checkUser(String username, String password);
}
