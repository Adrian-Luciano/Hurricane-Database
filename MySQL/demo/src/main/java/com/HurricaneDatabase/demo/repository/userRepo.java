package com.HurricaneDatabase.demo.repository;

import com.HurricaneDatabase.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface userRepo extends JpaRepository<User,Integer>{
    @Query(value = "SELECT * from user where username = ?1 and password = ?2", nativeQuery = true)
    List<User> verifyUser(String name, String password);
}
