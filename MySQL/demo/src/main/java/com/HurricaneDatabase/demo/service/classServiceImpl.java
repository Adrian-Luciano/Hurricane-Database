package com.HurricaneDatabase.demo.service;

import java.util.List;
import com.HurricaneDatabase.demo.model.Classification;
import com.HurricaneDatabase.demo.repository.classificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class classServiceImpl implements classService {

    @Autowired
    private classificationRepo classes ;

    @Override
    public List<Classification> getAll() {
     
        return classes.findAll();
    }

    @Override
    public List<Classification> findByID(int i) {
       
        return classes.findClasses(i);
    }

    @Override
    public void saveClassi(Classification temp) {
       classes.save(temp);
        
    }
    
}
