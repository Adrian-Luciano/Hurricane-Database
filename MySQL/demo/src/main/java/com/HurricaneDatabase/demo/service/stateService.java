package com.HurricaneDatabase.demo.service;

import com.HurricaneDatabase.demo.model.States;
import java.util.List;

public interface stateService {
    public List<States> affectedStates(int id);
    public void saveState(States st);
}
