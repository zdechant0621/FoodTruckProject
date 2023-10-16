package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String userTruck;
	private String userType;
	private int userRating;
	private int TruckID;
	private static int nextTruckID = 1001;

	public FoodTruck() {

	}

	public FoodTruck(String userTruck, String userType, int userRating) {
		this.userTruck = userTruck;
		this.userType = userType;
		this.userRating = userRating;
		this.TruckID = nextTruckID++;
		
	}

	public String getUserTruck() {
		return userTruck;
	}

	public void setUserTruck(String userTruck) {
		this.userTruck = userTruck;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getUserRating() {
		return userRating;
	}

	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}

	public int getTruckID() {
		return TruckID;
	}

	public void setTruckID(int truckID) {
		TruckID = truckID;
	}

	public int getNextTruckID() {
		return nextTruckID;
	}

	public static void setNextTruckID(int nextTruckID) {
		FoodTruck.nextTruckID = nextTruckID;
	}

	@Override
	public String toString() {
		return "FoodTruck= " + userTruck + "\nType of Food Served=" + userType + "\nRating= " + userRating
				+ "\nTruck ID NO.= " + TruckID;
	}

}
