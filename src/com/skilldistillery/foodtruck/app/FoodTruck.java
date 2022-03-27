package com.skilldistillery.foodtruck.app;

public class FoodTruck {

	private int idNumber;
	private String name;
	private String foodType;
	private int rating;
	static int idGenerator = 1001;
	
	public FoodTruck(String name, String foodType, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.idNumber = idGenerator;
	}

	
	public FoodTruck() {}
	
	public void incrementIdGenerator () {
		this.idGenerator = this.idGenerator + 1;
	}
}
