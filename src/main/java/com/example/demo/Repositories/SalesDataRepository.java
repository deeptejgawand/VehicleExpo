package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.SalesData;

@Repository
public interface SalesDataRepository extends JpaRepository<SalesData,Integer>{

}
