package com.HurricaneDatabase.demo.service;

import com.HurricaneDatabase.demo.model.Cyclone;
import java.util.List;

public interface cycloneService {
    public List<Cyclone> getAll();
    public List<Cyclone> findByName(String name);
    public void saveCyc(Cyclone cyc);
}
