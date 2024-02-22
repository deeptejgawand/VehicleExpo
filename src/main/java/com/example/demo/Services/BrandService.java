package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Entities.Brand;
import com.example.demo.Repositories.BrandRepository;

@Service
public class BrandService {
	@Autowired
	public BrandRepository brandRepo;
	public String saveBrand(Brand brand) {
		if(brand != null) {
			brandRepo.save(brand);
			return "Brand data saved successfully";
		}else {
			return "Something went wrong";
		}
		
	}
	
	public List<Brand> getAllBrands()
	{
		List<Brand> brandList=brandRepo.findAll();
		return brandList;
	}
	public Brand findOneBrand(int id) {
		return brandRepo.getById(id);
	}
	

}
