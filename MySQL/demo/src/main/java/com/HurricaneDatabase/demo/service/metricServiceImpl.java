package com.HurricaneDatabase.demo.service;

import java.util.List;
import com.HurricaneDatabase.demo.model.Metrics;
import com.HurricaneDatabase.demo.repository.metricsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class metricServiceImpl implements metricService {
    @Autowired
    metricsRepo metric;
    public List<Metrics> getMetrics(int id){
        return metric.getInfo(id);
    }
    @Override
    public void saveMetrics(Metrics me) {
        metric.save(me);
    }
}
