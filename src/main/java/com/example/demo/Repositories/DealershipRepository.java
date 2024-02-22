package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Dealership;

@Repository

public interface DealershipRepository extends JpaRepository<Dealership,Integer> {

}
