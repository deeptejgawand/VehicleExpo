package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "SELECT MAX(CAST(SUBSTRING(u.userId, 5) AS INTEGER)) FROM User u")
    Integer getLastUserId();
    
    @Query("SELECT u FROM User u WHERE u.emailid = ?1")
    User findByEmailId(String emailid);




}