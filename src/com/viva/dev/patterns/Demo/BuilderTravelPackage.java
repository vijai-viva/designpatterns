package com.viva.dev.patterns.Demo;

import com.viva.dev.patterns.creational.builder.TravelPackage;

public class BuilderTravelPackage {

	public static void main(String[] args) {
		TravelPackage budget = new TravelPackage.Builder("Budget-Veg-Goa").withSiteSeeingCharges().withSuite().withMeals("Veg").build();
		TravelPackage premium = new TravelPackage.Builder("Premium-Veg-Goa").withFlight().withSuite().withMeals("Veg").build();
		TravelPackage luxury = new TravelPackage.Builder("Premium-Veg-Goa").withFlight().withSuite().withSiteSeeingCharges().withMeals("Veg").build();
				
	}
}
