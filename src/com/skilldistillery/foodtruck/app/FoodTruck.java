package com.skilldistillery.foodtruck.app;

public class FoodTruck {

	private int idNumber = 1001;
	private String name;
	private String foodType;
	private int rating;
	
	public FoodTruck() {}
	
	public FoodTruck(String name, String foodType, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.idNumber = this.getIdNumber();
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public void setIdNumber() {
		this.idNumber = idNumber += 1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFoodType() {
		return foodType;
	}
	
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String toString () {
		return ("Name: " + this.name + "\tType: " + this.foodType + "\tRating: " + this.rating + "\tTruckID: " + this.idNumber);
	}

}
