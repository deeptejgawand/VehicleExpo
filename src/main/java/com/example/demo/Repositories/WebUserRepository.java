package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.WebUser;

@Repository
public interface WebUserRepository extends JpaRepository<WebUser, Integer> {

}
