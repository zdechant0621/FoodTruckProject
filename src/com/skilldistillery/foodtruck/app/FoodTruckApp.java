package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;

import java.util.Scanner;

public class FoodTruckApp {
	private FoodTruck[] fleet = new FoodTruck[5];
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.run();
	}

	public void run() {
		mainMenu();
		nextMenu();
	}

	// prompt user
	// write out a menu for user input
	public void mainMenu() {

		String userTruck = "";
		String userType = "";
		int userRating = 0;

		System.out.println("Enter 'quit' to access next menu");
		for (int counter = 0; counter < fleet.length; counter++) {
			System.out.print("Please enter the name of a food truck: ");
			userTruck = sc.nextLine();
			if (userTruck.equals("quit")) {
				nextMenu();
				break;
			}

			System.out.print("Please enter the type of food served: ");
			userType = sc.nextLine();

			System.out.print("Please enter a rating 1-5:");
			userRating = sc.nextInt();
			sc.nextLine();
			fleet[counter] = new FoodTruck(userTruck, userType, userRating);

		}

	}

	public void nextMenu() {
		System.out.println("Choose from the following options below");
		System.out.println("1: Show All Food Trucks");
		System.out.println("2. Show the Average Rating of all Food Trucks");
		System.out.println("3. Show the Highest Rated Truck");
		System.out.println("4. Quit");
		int input = sc.nextInt();
		sc.nextLine();
		switch (input) {
		default:
			System.out.println("You've entered a wrong input!");
			nextMenu();
			break;
		case 1:
			display();
			break;

		case 2:
			average();
			break;

		case 3:
			highest();
			break;
		case 4:
			System.out.println("Goodbye");
			System.exit(input);

		}
		// sc.close();
	}

	public void display() {
		for (FoodTruck foodTruck : fleet) {
			if (foodTruck != null)
				System.out.println(foodTruck);
				System.out.println("");
		}
		nextMenu();
	}

	public void average() {
		double total = 0;
		double average = 0;
		double trucks = 0;
		for (FoodTruck foodTruck : fleet) {
			if (foodTruck != null) {
				total = total + foodTruck.getUserRating();
				trucks++;

			}

		}
		average = total / trucks;
		System.out.println("The average is " + average);
		System.out.println("");
		nextMenu();
	}

	public void highest() {
		int highest = 0;
		FoodTruck best = null;
		for (FoodTruck foodTruck : fleet) {
			if (foodTruck != null) {
				if (highest < foodTruck.getUserRating()) {
					highest = foodTruck.getUserRating();
					best = foodTruck;
				}
			}

		}
		System.out.println(best);
		System.out.println("");
		nextMenu();
	}

}
