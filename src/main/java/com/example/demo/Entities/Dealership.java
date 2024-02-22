package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dealership")
public class Dealership {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dealershipID")
	public int dealershipID;
	@Column(name="dealershipName")
	public String dealershipName;
	@Column(name="dealershipOwnerName")
	public String dealershipOwnerName;
	@Column(name="dealershipVehicleCapacity")
	public int dealershipVehicleCapacity;
	@Column(name="dealershipAddress")

	public String dealershipAddress;
	@Column(name="dealershipPincode")

	public String dealershipPincode;
	@Column(name="city")

	public String city;
	public int getDealershipID() {
		return dealershipID;
	}
	public void setDealershipID(int dealershipID) {
		this.dealershipID = dealershipID;
	}
	public String getDealershipName() {
		return dealershipName;
	}
	public void setDealershipName(String dealershipName) {
		this.dealershipName = dealershipName;
	}
	public String getDealershipOwnerName() {
		return dealershipOwnerName;
	}
	public void setDealershipOwnerName(String dealershipOwnerName) {
		this.dealershipOwnerName = dealershipOwnerName;
	}
	public int getDealershipVehicleCapacity() {
		return dealershipVehicleCapacity;
	}
	public void setDealershipVehicleCapacity(int dealershipVehicleCapacity) {
		this.dealershipVehicleCapacity = dealershipVehicleCapacity;
	}
	public String getDealershipAddress() {
		return dealershipAddress;
	}
	public void setDealershipAddress(String dealershipAddress) {
		this.dealershipAddress = dealershipAddress;
	}
	public String getDealershipPincode() {
		return dealershipPincode;
	}
	public void setDealershipPincode(String dealershipPincode) {
		this.dealershipPincode = dealershipPincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
