package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	public FoodTruck[] foodTruckArr = new FoodTruck[5];
	
	public int truckTotal = 0;
	
	public static void main(String[] args) {
		
		FoodTruckApp app = new FoodTruckApp();
		app.run();
		
	}
	
	private void run() {
		Scanner kb = new Scanner(System.in);
		
		FoodTruck foodTruckTemp = null;

		int counter;
		String truckName;
		String foodType;
		double rating;
		boolean again = true;
		
		for (int i = 0; i < 5; i++) {
			
			counter = i + 1;
			
			System.out.println("Name of food truck #" + counter + ":");
			truckName = kb.nextLine();
			if (truckName.equalsIgnoreCase("quit")) {
				truckName = null;
				break;
			}
			System.out.println("Food type served: ");
			foodType = kb.nextLine();

			System.out.println("Numeric rating (0-10): ");
			rating = kb.nextDouble();
			kb.nextLine();
			
			truckTotal++;
			
			foodTruckTemp = new FoodTruck(counter, truckName, foodType, rating);	
			foodTruckArr[i] = foodTruckTemp;
		}
		while(again == true) {
			System.out.println("***** System Menu *****");
			System.out.println("1 - List all food trucks");
			System.out.println("2 - Average rating of food trucks");
			System.out.println("3 - Display the highest rated food truck");
			System.out.println("4 - Quit the program");
			System.out.println();
			System.out.print("Input menu selection: ");
			int selection = kb.nextInt();
			if (selection == 1) {
				for(int i=0; i<truckTotal; i++) {
					FoodTruck temp = foodTruckArr[i];
					if(temp.getName()==null) {
						break;
					}
					System.out.println(temp.toString());
				}
			}
			else if (selection == 2) {
				double ratingsCurrent = 0;
				double ratingAvg = 0;
				for (int i = 0; i<truckTotal; i++) {
					FoodTruck temp = foodTruckArr[i];
					if(temp.getName().equals(null)) {
						break;
					}
					ratingsCurrent = ratingsCurrent + temp.getNumRating();
					ratingAvg = ratingsCurrent / truckTotal;
				}
				System.out.println("The average rating is " + ratingAvg);
			}
			else if (selection == 3) {
				double ratingHighest = 0;
				int highestNumId = 0;
				String truckDisplay = "";
				for (int i = 0; i<truckTotal; i++) {
					FoodTruck temp = foodTruckArr[i];
					if (temp.getNumRating() > ratingHighest) {
						ratingHighest = temp.getNumRating();
						highestNumId = i + 1;
					}
				truckDisplay = temp.toString();	
				}
				
				System.out.println("The highest rated food truck is Truck #" + highestNumId);	
				System.out.println(truckDisplay);
			}	
			else if (selection == 4) {
				again = false;
				break;	
			}
			
			else {
				System.out.println("Incorrect input. Please try again.");
			}
			
		
	}
		System.out.println("Thank you for using The Food Truck App! Have a nice day :)");
		kb.close();	
}
}
