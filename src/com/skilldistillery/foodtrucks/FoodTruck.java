package com.skilldistillery.foodtrucks;

public class FoodTruck {

	//Fields
	private int numId;
	private String name;
	private String foodType;
	private double numRating;
	
	// Constructors

	
	public FoodTruck(int numId, String name, String foodType, double numRating) {
		super();
		this.numId = numId;
		this.name = name;
		this.foodType = foodType;
		this.numRating = numRating;
	}
	
	public FoodTruck() {
		super();
	}

	// Methods
	public int getNumId() {
		return numId;
	}
	
	public void setNumId(int numId) {
		this.numId = numId;
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
	public double getNumRating() {
		return numRating;
	}
	public void setNumRating(double numRating) {
		this.numRating = numRating;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Truck #").append(numId).append(", Name - ").append(name).append(", Food served - ").append(foodType).append(", Numeric rating - ")
				.append(numRating);
		return builder.toString();
	}
	
	public void displayFoodTruck() {
		String foodTruckData = this.toString();
		System.out.println(foodTruckData);
		
	}
	
	public String getInfo() {
		return "Food Truck #" + numId + ": Name - " + name + "  Food type - " + foodType + "  Rating - " + numRating;
	}
}
