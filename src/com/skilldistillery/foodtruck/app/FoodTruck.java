package com.skilldistillery.foodtruck.app;

public class FoodTruck {

	private int idNumber;
	private String name;
	private String foodType;
	private int rating;
	
	public FoodTruck() {}
	
	public FoodTruck(String name, String foodType, int rating, int idNumber) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.idNumber = idNumber;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
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
	
	public void greeting() {
		System.out.println("Hello!  Welcome to the Food Truck Rating Application!");
		System.out.println();
		System.out.println("You will be able to add up to five different food trucks,");
		System.out.println("with their name and the type of food they serve");
		System.out.println("(tacos, pizza, ribs, burgers, sushi, whatever).");
		System.out.println();
		System.out.println("You will be able to give each food truck a rating");
		System.out.println("(1-5, with 1 being worst and 5 being best).");
		System.out.println();
	}

}
