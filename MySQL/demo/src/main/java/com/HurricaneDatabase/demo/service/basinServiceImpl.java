package com.HurricaneDatabase.demo.service;

import com.HurricaneDatabase.demo.model.Basin;
import com.HurricaneDatabase.demo.repository.basinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class basinServiceImpl implements basinService{
    @Autowired
    private basinRepo basin ;
    public List<Basin> getAll(){
        return basin.findAll();
    }
    @Override
    public List<Basin> getBasin(int i) {
        return basin.getBasin(i);
    }
    @Override
    public void saveBasin(Basin temo) {
      basin.save(temo);
        
    }
}
