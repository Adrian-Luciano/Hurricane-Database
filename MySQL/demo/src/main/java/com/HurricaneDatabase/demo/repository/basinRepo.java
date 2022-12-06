package com.HurricaneDatabase.demo.repository;

import com.HurricaneDatabase.demo.model.Basin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface basinRepo extends JpaRepository<Basin, Integer>{
    @Query(value = "select * from cse111.basin where cycid = ?1", nativeQuery = true)
    List<Basin> getBasin(int i);
    
}
