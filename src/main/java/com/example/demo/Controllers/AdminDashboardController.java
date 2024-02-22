package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Entities.Bike;
import com.example.demo.Entities.Brand;
import com.example.demo.Helper.FileUploadUtil;
import com.example.demo.Services.BikeService;
import com.example.demo.Services.BrandService;


@Controller
@RequestMapping("admin")
public class AdminDashboardController {
	@Autowired
	BikeService bikeService;
	@Autowired
	BrandService brandService;
	//create bikes
	//create Notices
	//sales data
	//see user data 
	//create dealership
	//see dealership data
	@GetMapping("/home")
	public String adminHome(Model model) {
		
		return "adminDashboard";
	}
	@GetMapping("/addbike")
	public String bikeForm(Model model) {
		model.addAttribute("bike", new Bike());
		return "addBike";
		
	}
	@PostMapping("/saveBike")
	public String registerBike(@ModelAttribute Bike bike, @RequestParam("bikeImage") MultipartFile multipartFile1, Model model) throws Exception {
		String imagePath1 = StringUtils.cleanPath(multipartFile1.getOriginalFilename());
		bike.setBikeImagePath(imagePath1);

		String savedOrNot = bikeService.saveBike(bike);

		FileUploadUtil.saveFile("static/bikeImages/", imagePath1, multipartFile1);
		String message = savedOrNot;
		model.addAttribute("message", message);

		return "addBike";
	}
	
	@GetMapping("/addbrand")
	public String brandForm() {
		return "addBrand";
		
	}
	
	@PostMapping("/saveBrand")
	public String registerBrand(@ModelAttribute Brand brand, @RequestParam("brandLogo") MultipartFile multipartFile1, Model model) throws Exception {
		String imagePath1 = StringUtils.cleanPath(multipartFile1.getOriginalFilename());
		brand.setBrandLogoImage(imagePath1);

		String savedOrNot = brandService.saveBrand(brand);

		FileUploadUtil.saveFile("static/brandLogos/", imagePath1, multipartFile1);
		String message = savedOrNot;
		model.addAttribute("message", message);

		return "addBrand";
	}
	@GetMapping("/getAllBikes")
	public String showBikes(Model model){
		List<Bike> bikeList=bikeService.getAllBikes();
		model.addAttribute("bikeList",bikeList);
		return "adminBikeGallary";

	}
	@GetMapping("/bikeInfo")
	public String bikeInfo(@RequestParam("id") String bikeId,Model model) {
		int id=Integer.parseInt(bikeId);
		model.addAttribute("bike", bikeService.findOneBike(id));
		
		return "bikeInfo";
	}
	@GetMapping("/brandInfo")
	public String brandInfo(@RequestParam("id") String brandId,Model model) {
		int id=Integer.parseInt(brandId);
		model.addAttribute("brand", brandService.findOneBrand(id));
		
		return "brandInfo";
	}
	

}
