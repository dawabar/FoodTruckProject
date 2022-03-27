package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {
	

	public FoodTruck trucks[];
	
	public static void main(String[] args) {
//		User Story #1
//		The user is prompted to input the name, food type, and rating for up to five food trucks. 
//		For each set of input:
//			- a FoodTruck object is created, 
//			- its fields set to the user's input, and 
//			- it is added to the array. 
//		The truck id is not input by the user, but 
//			instead assigned automatically in the FoodTruck constructor 
//			from a static field that is incremented as each truck is created.
		
//		Create new Scanner for user inputs
		Scanner sc = new Scanner(System.in);

//		Send introduction to user
		UserInteraction io = new UserInteraction();
		io.greeting();
//		io.makeChoice();
		
		int truckArrayCount = 0;
		while (truckArrayCount < 5) {
			System.out.println("Do you want to enter a truck?");
			System.out.println("Enter 'yes' to add a truck, enter 'quit' when you're done.");
			String userInput = sc.nextLine();
			userInput = userInput.trim();
			if (userInput.charAt(0) == 'q' || userInput.charAt(0) == 'Q') {
				break;
			} 
			else if (userInput.charAt(0) != 'y' || userInput.charAt(0) != 'Y') {
				System.out.println("Please enter a valid choice.");
				continue;
			} 
			else {
				trucks[truckArrayCount] = UserInteraction.getTrucks();
				truckArrayCount++;
			}
		}


	}

}

