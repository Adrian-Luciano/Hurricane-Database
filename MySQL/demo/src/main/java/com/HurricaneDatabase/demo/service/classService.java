package com.HurricaneDatabase.demo.service;

import com.HurricaneDatabase.demo.model.Classification;
import java.util.List;

public interface classService {
    public List<Classification> getAll();
    public List<Classification> findByID(int i);
}
