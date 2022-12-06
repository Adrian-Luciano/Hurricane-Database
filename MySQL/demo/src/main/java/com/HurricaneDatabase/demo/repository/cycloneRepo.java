package com.HurricaneDatabase.demo.repository;

import com.HurricaneDatabase.demo.model.Cyclone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface cycloneRepo extends JpaRepository<Cyclone, Integer>{
    @Query(value = "select * from cse111.cyclone where name = ?1", nativeQuery = true)
    List<Cyclone> findCyclone(String name);
}
