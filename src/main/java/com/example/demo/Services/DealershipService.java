package com.example.demo.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entities.Dealership;
import com.example.demo.Repositories.DealershipRepository;

@Service
public class DealershipService {
    @Autowired
    private DealershipRepository dealershipRepository;

    public String saveDealership(Dealership dealership) {
        if (dealership != null) {
            dealershipRepository.save(dealership);
            return "Dealership saved successfully";
        } else {
            return "Failed to save dealership. Please provide valid information.";
        }
    }

    public List<Dealership> getAllDealerships() {
        return dealershipRepository.findAll();
    }

    public Dealership findDealershipById(int dealershipId) {
        return dealershipRepository.getById(dealershipId);
    }
}
