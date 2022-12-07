package com.HurricaneDatabase.demo.service;

import com.HurricaneDatabase.demo.model.Damage;
import java.util.List;

public interface damageService {
    public List<Damage> getInfo(int id);
    public void saveDam(Damage dame);
}
