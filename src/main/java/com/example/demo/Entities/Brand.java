package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="brands")
public class Brand {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="brandID")
	public int brandID;
	@Column(name="brandName")
	public String brandName;
	@Column(name="bikeId")
	public String brandDescription;
	@Column(name="countryOfOrigin")
	public String countryOfOrigin;
	@Column(name="brandCEOName")
	public String brandCEOName;
	@Column(name="yearOfOrigin")
	public String yearOfOrigin;
	@Column(name="brandLogoImage")
	public String brandLogoImage;
	public int getBrandID() {
		return brandID;
	}
	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandDescription() {
		return brandDescription;
	}
	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getBrandCEOName() {
		return brandCEOName;
	}
	public void setBrandCEOName(String brandCEOName) {
		this.brandCEOName = brandCEOName;
	}
	public String getYearOfOrigin() {
		return yearOfOrigin;
	}
	public void setYearOfOrigin(String yearOfOrigin) {
		this.yearOfOrigin = yearOfOrigin;
	}
	public String getBrandLogoImage() {
		return brandLogoImage;
	}
	public void setBrandLogoImage(String brandLogoImage) {
		this.brandLogoImage = brandLogoImage;
	}
	
	
	

}
