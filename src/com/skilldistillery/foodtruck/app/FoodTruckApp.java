package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	public FoodTruck trucks[];
	private static int idGenerator = 1001;

//		Create new Scanner for user inputs

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

		Scanner sc = new Scanner(System.in);

		//		Send introduction to user
		FoodTruck.greeting();

//		Make a choice about whether to add another truck to the array
		int truckArrayCount = 0;
		boolean keepGoing = true;
		String userInput = "dummy data";
		while (truckArrayCount < 5 && keepGoing == true) {
			System.out.println("Do you want to enter a truck?");
			System.out.println("Enter 'yes' to add a truck, enter 'quit' when you're done.");
			userInput = sc.next();
			userInput = userInput.trim();
			System.out.println("Input value was " + userInput);
			if (userInput.trim().toLowerCase().equals("quit")) {
				keepGoing = false;
//				TODO remove this line -- System.out.println(userInput);
				sc.nextLine();
				break;
			} else if (userInput.trim().toLowerCase().equals("yes")) {
				System.out.println(userInput);
				System.out.println("User chose YES");
				truckArrayCount = getTrucks(truckArrayCount);
				break;
			} else if (!userInput.trim().toLowerCase().equals("yes") && !userInput.equals("")) {
				System.out.println(userInput);
				System.out.println("Please enter a valid choice.");
				continue;
			}
		}

		boolean keepDisplaying = true;
		int choice;
		do {
			System.out.println("########################################");
			System.out.println("# 1. List all food trucks              #");
			System.out.println("# 2. Average rating of all food trucks #");
			System.out.println("# 3. Highest rated food truck          #");
			System.out.println("# 4. Quit application                  #");
			System.out.println("########################################");
			System.out.println();
			System.out.println("Choose an option (1-4): ");
			choice = sc.nextInt();
			if (choice < 1 || choice > 4) {
				System.out.println("Please enter a valid choice (1-4)");
				continue;
			}
			else {
				switch (choice)
			}
			while (keepDisplaying = true) {
		}
			if (keepDisplaying == false) {
				System.out.println("Thank you for using this system. Goodbye.");
				break;
			}
			else if (choice < 1 || choice)

		}

	}


	// Add a truck to the trucks array
	public int getTrucks(int count) {

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
		newFT = new FoodTruck(nameTemp, foodTemp, ratingTemp, idGenerator);
		trucks[count] = newFT;
		idGenerator += 1;
		return count++;
	}

}
