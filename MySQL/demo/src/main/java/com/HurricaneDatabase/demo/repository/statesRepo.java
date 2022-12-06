package com.HurricaneDatabase.demo.repository;

import com.HurricaneDatabase.demo.model.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface statesRepo extends JpaRepository<States,Integer>{
    @Query(value = "select * from cse111.states where cycid = ?1", nativeQuery = true)
    List<States> getInfo(int id);
}
