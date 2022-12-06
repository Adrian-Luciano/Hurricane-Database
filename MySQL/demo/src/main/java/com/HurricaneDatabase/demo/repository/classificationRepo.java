package com.HurricaneDatabase.demo.repository;

import com.HurricaneDatabase.demo.model.Classification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface classificationRepo extends JpaRepository<Classification,Integer>{
    @Query(value = "select * from cse111.classification where cycid = ?1 ", nativeQuery = true)
    List<Classification> findClasses(int i);
}
