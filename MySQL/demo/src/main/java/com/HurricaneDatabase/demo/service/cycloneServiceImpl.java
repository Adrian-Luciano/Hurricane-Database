package com.HurricaneDatabase.demo.service;

import java.util.List;

import com.HurricaneDatabase.demo.model.Cyclone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.HurricaneDatabase.demo.repository.cycloneRepo;

@Service
public class cycloneServiceImpl implements cycloneService {
    @Autowired
    cycloneRepo cyclone;
    
    @Override
    public List<Cyclone> getAll() {
        return cyclone.findAll();
    }

    @Override
    public List<Cyclone> findByName(String name) {
        return cyclone.findCyclone(name);
    }

    @Override
    public void saveCyc(Cyclone cyc) {
        cyclone.save(cyc);
    }
    
}
