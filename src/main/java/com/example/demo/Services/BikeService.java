package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Bike;
import com.example.demo.Repositories.BikeRepository;

@Service
public class BikeService {
	@Autowired
	public BikeRepository bikeRepo;
	
	public String saveBike(Bike bike) {
		if(bike != null) {
			bikeRepo.save(bike);
			return "Bike data saved successfully";
		}else {
			return "Something went wrong";
		}
		
	}
	
	public List<Bike> getAllBikes()
	{
		List<Bike> bikeList=bikeRepo.findAll();
		return bikeList;
	}
	public Bike findOneBike(int bikeId) {
		return bikeRepo.getById(bikeId);
	}
}
