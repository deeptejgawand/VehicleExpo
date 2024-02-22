package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="testDriveRequests")
public class TestDriveRequest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="testDriveID")
	public int testDriveID;
	@Column(name="bikeName")

	public String bikeName;
	@Column(name="requestedDate")

	public String requestedDate;
	@Column(name="dealerShipId")

	public int dealerShipId;
	@Column(name="requestedTimeSlot")

	public String requestedTimeSlot;
	@Column(name="userID")

	public int userID;
	@Column(name="userName")

	public String userName;
	@Column(name="approvalStatus")

	public boolean approvalStatus;
	public int getTestDriveID() {
		return testDriveID;
	}
	public void setTestDriveID(int testDriveID) {
		this.testDriveID = testDriveID;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(String requestedDate) {
		this.requestedDate = requestedDate;
	}
	public int getDealerShipId() {
		return dealerShipId;
	}
	public void setDealerShipId(int dealerShipId) {
		this.dealerShipId = dealerShipId;
	}
	public String getRequestedTimeSlot() {
		return requestedTimeSlot;
	}
	public void setRequestedTimeSlot(String requestedTimeSlot) {
		this.requestedTimeSlot = requestedTimeSlot;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(boolean approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	
	
	

}
