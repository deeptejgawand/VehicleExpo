package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.TestDriveRequest;

@Repository
public interface TestDriveRequestRepository extends JpaRepository<TestDriveRequest, Integer>{

}
