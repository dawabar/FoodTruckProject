package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class UserInteraction {

	Scanner sc = new Scanner(System.in);

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

//	public void makeChoice() {
//		int truckArrayCount = 0;
//		while (truckArrayCount < 5) {
//			System.out.println("Do you want to enter a truck?");
//			System.out.println("Enter 'yes' to add a truck, enter 'quit' when you're done.");
//			String userInput = sc.nextLine();
//			userInput = userInput.trim();
//			if (userInput.charAt(0) == 'q' || userInput.charAt(0) == 'Q') {
//				break;
//			} 
//			else if (userInput.charAt(0) != 'y' || userInput.charAt(0) != 'Y') {
//				System.out.println("Please enter a valid choice.");
//				continue;
//			} 
//			else {
//				getTrucks();
//				truckArrayCount++;
//			}
//		}
//	}

//	Get up to five truck inputs from the user
	public FoodTruck getTrucks() {

		String nameTemp = "";
		String foodTemp = "";
		int ratingTemp = 0;
		FoodTruck newFT;
		System.out.println("Enter a truck name: \n");
		nameTemp = sc.nextLine();
		System.out.println("What kind of food does it serve: \n");
		foodTemp = sc.nextLine();
		System.out.println("Give the food truck a rating (1-5): \n");
		ratingTemp = sc.nextInt();
		while (ratingTemp < 1 || ratingTemp > 5) {
			System.out.println("The rating must be a number between 1 and 5.");
			System.out.println("Give the food truck a rating (1-5): \n");
			ratingTemp = sc.nextInt();
		}
		newFT = new FoodTruck(nameTemp, foodTemp, ratingTemp);
		return newFT;
	}
}
