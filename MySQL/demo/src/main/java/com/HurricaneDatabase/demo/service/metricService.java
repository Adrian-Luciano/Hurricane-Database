package com.HurricaneDatabase.demo.service;

import com.HurricaneDatabase.demo.model.Metrics;
import java.util.List;

public interface metricService {
    List<Metrics> getMetrics(int id);
    public void saveMetrics(Metrics me);
    
}
