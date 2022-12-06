package com.HurricaneDatabase.demo.service;

import java.util.List;

import com.HurricaneDatabase.demo.model.Damage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.HurricaneDatabase.demo.repository.damageRepo;

@Service
public class damgeServiceImpl implements damageService{
    @Autowired
    damageRepo dam;

    @Override
    public List<Damage> getInfo(int id) {
        return dam.getDamage(id);
    }
    
}
