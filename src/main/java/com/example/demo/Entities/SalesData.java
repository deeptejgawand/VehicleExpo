package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="salesData")
public class SalesData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="salesID")
	public int salesID;
	@Column(name="bikeID")
	public int bikeID;
	@Column(name="dealershipID")
	public int dealershipID;
	@Column(name="bikeName")
	public String bikeName;
	@Column(name="customerName")
	public String customerName;
	@Column(name="customerPhoneNumber")
	public String customerPhoneNumber;
	@Column(name="customerEmailID")
	public String customerEmailID;
	@Column(name="dateOfSales")
	public String dateOfSales;
	@Column(name="dateOfOrder")
	public String dateOfOrder;
	@Column(name="orderStatus")
	public String orderStatus;
	public int getSalesID() {
		return salesID;
	}
	public void setSalesID(int salesID) {
		this.salesID = salesID;
	}
	public int getBikeID() {
		return bikeID;
	}
	public void setBikeID(int bikeID) {
		this.bikeID = bikeID;
	}
	public int getDealershipID() {
		return dealershipID;
	}
	public void setDealershipID(int dealershipID) {
		this.dealershipID = dealershipID;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public String getCustomerEmailID() {
		return customerEmailID;
	}
	public void setCustomerEmailID(String customerEmailID) {
		this.customerEmailID = customerEmailID;
	}
	public String getDateOfSales() {
		return dateOfSales;
	}
	public void setDateOfSales(String dateOfSales) {
		this.dateOfSales = dateOfSales;
	}
	public String getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(String dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	

}
