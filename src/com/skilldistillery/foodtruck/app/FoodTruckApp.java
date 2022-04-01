package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	public FoodTruck trucks[];
	private static int idGenerator = 1001;

//		Create new Scanner for user inputs
	Scanner sc = new Scanner(System.in);

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

		FoodTruckApp fta = new FoodTruckApp();

		// Send introduction to user
		fta.greeting();
//		Make a choice about whether to add another truck to the array
		FoodTruck trucks[] = new FoodTruck[5];
//		fta.addFoodTrucks();
		trucks[0] = new FoodTruck("Pizza Bob", "Pizza", 3);
		trucks[0].setName("Pizza Bob");
		trucks[0].setFoodType("Pizza");
		trucks[0].setRating(3);
		trucks[0].getIdNumber();
		trucks[0].setIdNumber();

		trucks[1] = new FoodTruck("Pizza Bob", "Pizza", 3);
		trucks[1].getIdNumber();
		trucks[1].setName("Sushi Express");
		trucks[1].setFoodType("Sushi");
		trucks[1].setRating(4);
		trucks[1].setIdNumber();

		trucks[2] = new FoodTruck("Pizza Bob", "Pizza", 3);
		trucks[2].getIdNumber();
		trucks[2].setName("Taco Terry");
		trucks[2].setFoodType("Tacos");
		trucks[2].setRating(5);
		trucks[2].setIdNumber();

		fta.giveMenu();
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

	public void addFoodTrucks() {
		int truckArrayCount = 0;
		boolean keepGoing = true;
		while (truckArrayCount < 5 && keepGoing == true) {
			System.out.println("Do you want to enter a truck? Y/N: ");
			String userInput = sc.next();
			userInput = userInput.toUpperCase().trim();
			if (userInput.equals("N")) {
				keepGoing = false;
				sc.nextLine();
				break;
			} else if (userInput.equals("Y")) {
				FoodTruck tempTruck = getTrucks();
				System.out.println(tempTruck.toString());
				FoodTruck nextTruck = trucks[truckArrayCount];
				nextTruck = tempTruck;
				sc.nextLine();
				truckArrayCount++;
				break;
			} else {
				System.out.println(userInput);
				System.out.println("Please enter a valid choice.");
				continue;
			}
		}
	}

	// Add a truck to the trucks array
	public FoodTruck getTrucks() {

		String nameTemp = "";
		String foodTemp = "";
		int ratingTemp = 0;
		sc.nextLine();
		System.out.println("Enter a truck name: ");
		nameTemp = sc.nextLine();
		System.out.println("What kind of food does it serve: ");
		foodTemp = sc.nextLine();
		System.out.println("Give the food truck a rating (1-5): ");
		ratingTemp = sc.nextInt();
		while (ratingTemp < 1 || ratingTemp > 5) {
			System.out.println("The rating must be a number between 1 and 5.");
			System.out.println("Give the food truck a rating (1-5): \n");
			ratingTemp = sc.nextInt();
		}
		FoodTruck newFT = new FoodTruck(nameTemp, foodTemp, ratingTemp);
		newFT.setIdNumber();
		return new FoodTruck(nameTemp, foodTemp, ratingTemp);
	}

	public void giveMenu() {
		boolean keepDisplaying = true;
		int choice;
		while (keepDisplaying = true) {
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
			} else {
				switch (choice) {
				case 1:
					listFoodTrucks();
				case 2:
					averageRating();
				case 3:
					getHighestRated();
				case 4:
					keepDisplaying = false;
					System.out.println("Thank you for using this system. Goodbye.");
					break;
				}
			}
		}

	}

	public void listFoodTrucks() {
		for (int i = 0; i < 5; i++) {
			System.out.println(trucks[i].toString());
		}
	}

	public void averageRating() {
		double average = 0;
		int count = 0;
		for (FoodTruck foodTruck : trucks) {
			if (foodTruck.getRating() != 0) {
				average += foodTruck.getRating();
				count++;
			}
		}
		average = average / count;
		System.out.println("Average rating is " + average);
	}

	public void getHighestRated() {
		int rating = 0;
		int arrayLoc = -1;
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i].getRating() > rating) {
				rating = trucks[i].getRating();
				arrayLoc = i;
				i++;
			}
		}
		System.out.println("Highest rated truck is " + trucks[arrayLoc] + "with score " + rating);
	}

}
