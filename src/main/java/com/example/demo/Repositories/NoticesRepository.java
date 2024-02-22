package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Notices;
@Repository
public interface NoticesRepository extends JpaRepository<Notices, Integer> {

}
