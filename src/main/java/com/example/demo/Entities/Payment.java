package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payments")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paymentID")
	public int paymentID;
	//hidden
	@Column(name="bikeID")

	public int bikeID;
	@Column(name="price")

	public int price;
	@Column(name="tax")

	public int tax;
	@Column(name="customerFirstName")

	public String customerFirstName;
	@Column(name="customerLastName")

	public String customerLastName;
	@Column(name="customerPicture")

	public String customerPicture;
	@Column(name="customerAddress")

	public String customerAddress;
	@Column(name="documentsSubmitted")

	public boolean documentsSubmitted;
	@Column(name="hasDrivingLicense")

	public boolean hasDrivingLicense;
	@Column(name="dealershipID")

	public int dealershipID;
	
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public int getBikeID() {
		return bikeID;
	}
	public void setBikeID(int bikeID) {
		this.bikeID = bikeID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerPicture() {
		return customerPicture;
	}
	public void setCustomerPicture(String customerPicture) {
		this.customerPicture = customerPicture;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public boolean isDocumentsSubmitted() {
		return documentsSubmitted;
	}
	public void setDocumentsSubmitted(boolean documentsSubmitted) {
		this.documentsSubmitted = documentsSubmitted;
	}
	public boolean isHasDrivingLicense() {
		return hasDrivingLicense;
	}
	public void setHasDrivingLicense(boolean hasDrivingLicense) {
		this.hasDrivingLicense = hasDrivingLicense;
	}
	
	

}
