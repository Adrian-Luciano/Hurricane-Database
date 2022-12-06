package com.HurricaneDatabase.demo.repository;

import com.HurricaneDatabase.demo.model.Damage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface damageRepo extends JpaRepository<Damage,Integer> {
    @Query(value = "Select * from cse111.damage where id = ?1", nativeQuery = true)
    List<Damage> getDamage(int id);
    
}
