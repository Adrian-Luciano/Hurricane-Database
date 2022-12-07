package com.HurricaneDatabase.demo.service;
import com.HurricaneDatabase.demo.model.Basin;
import java.util.List;

public interface basinService {
    public List<Basin> getAll();
    public List<Basin> getBasin(int i);
    public void saveBasin(Basin temp);
}
