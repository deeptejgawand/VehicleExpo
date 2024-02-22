package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entities.TestDriveRequest;
import com.example.demo.Repositories.TestDriveRequestRepository;

@Service
public class TestDriveRequestService {
    @Autowired
    private TestDriveRequestRepository testDriveRequestRepository;

    public List<TestDriveRequest> getAllTestDriveRequests() {
        return testDriveRequestRepository.findAll();
    }

    public TestDriveRequest getTestDriveRequestById(int id) {
        return testDriveRequestRepository.findById(id).orElse(null);
    }

    public TestDriveRequest saveTestDriveRequest(TestDriveRequest testDriveRequest) {
        return testDriveRequestRepository.save(testDriveRequest);
    }

    public void deleteTestDriveRequest(int id) {
        testDriveRequestRepository.deleteById(id);
    }
}
