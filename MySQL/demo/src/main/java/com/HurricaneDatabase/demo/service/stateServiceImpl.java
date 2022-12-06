package com.HurricaneDatabase.demo.service;

import java.util.List;

import com.HurricaneDatabase.demo.model.States;
import com.HurricaneDatabase.demo.repository.statesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class stateServiceImpl implements stateService{
    @Autowired
    statesRepo state;
    @Override
    public List<States> affectedStates(int id) {
        return state.getInfo(id);
    }
    
}
