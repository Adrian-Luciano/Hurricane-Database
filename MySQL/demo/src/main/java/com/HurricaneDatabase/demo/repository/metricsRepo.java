package com.HurricaneDatabase.demo.repository;

import com.HurricaneDatabase.demo.model.Metrics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface metricsRepo extends JpaRepository<Metrics,Integer>{
    @Query(value = "select * from cse111.metrics where id = ?1", nativeQuery = true)
    List<Metrics> getInfo(int id);
}
