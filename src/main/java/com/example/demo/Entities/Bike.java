package com.example.demo.Entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="bikes")
public class Bike {
	   @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="bikeId")
	    private Integer bikeId;

	    @NotBlank
	    @Column(name="modelName")
	    private String modelName;

	    @NotNull
	    @Column(name="engineCapacity")
	    private Integer engineCapacity;

	    @NotNull
	    @Column(name="mileage")
	    private Integer mileage;

	    @NotBlank
	    @Column(name="transmission")
	    private String transmission;

	    @NotNull
	    @Min(value = 0, message = "Fuel tank capacity must be greater than or equal to zero")
	    @Column(name="fuelTankCapacity")
	    private Integer fuelTankCapacity;

	    @NotBlank
	    @Column(name="summary")
	    private String summary;

	    @NotBlank
	    @Column(name="bikeImagePath")
	    private String bikeImagePath;

	    @NotBlank
	    @Column(name="youtubeReview")
	    private String youtubeReview;

	    @NotNull
	    @Column(name="topSpeed")
	    private int topSpeed;
	public Integer getBikeId() {
		return bikeId;
	}
	public void setBikeId(Integer bikeId) {
		this.bikeId = bikeId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Integer getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(Integer engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public Integer getMileage() {
		return mileage;
	}
	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public Integer getFuelTankCapacity() {
		return fuelTankCapacity;
	}
	public void setFuelTankCapacity(Integer fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getBikeImagePath() {
		return bikeImagePath;
	}
	public void setBikeImagePath(String bikeImagePath) {
		this.bikeImagePath = bikeImagePath;
	}
	public String getYoutubeReview() {
		return youtubeReview;
	}
	public void setYoutubeReview(String youtubeReview) {
		this.youtubeReview = youtubeReview;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	
	
	

}
