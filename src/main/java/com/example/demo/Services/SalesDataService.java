package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entities.SalesData;
import com.example.demo.Repositories.SalesDataRepository;

@Service
public class SalesDataService {
    @Autowired
    private SalesDataRepository salesDataRepository;

    // Additional methods can be defined here

    public List<SalesData> getAllSalesData() {
        return salesDataRepository.findAll();
    }

    public SalesData getSalesDataById(int id) {
        return salesDataRepository.findById(id).orElse(null);
    }

    public SalesData saveSalesData(SalesData salesData) {
        return salesDataRepository.save(salesData);
    }

    public void deleteSalesData(int id) {
        salesDataRepository.deleteById(id);
    }
}
