package com.viva.dev.patterns.Demo;

import com.viva.dev.patterns.creational.abstractfactory.BudgetTravePackage;
import com.viva.dev.patterns.creational.abstractfactory.Cruise;
import com.viva.dev.patterns.creational.abstractfactory.Flight;
import com.viva.dev.patterns.creational.abstractfactory.LuxuryTravePackage;
import com.viva.dev.patterns.creational.abstractfactory.TravelPackageFactory;

public class AbstractFactoryTravelAgencyApp {

	private Cruise cruise;
	private Flight flight;
	
	public AbstractFactoryTravelAgencyApp(TravelPackageFactory factory) {
		cruise = factory.createCruise();
		flight = factory.createFlight();
	}
	
	   public void showPackageDetails() {
	        cruise.getDetails();
	        flight.getDetails();
	    }
	
	public static void main(String[] args) {
		TravelPackageFactory LuxuryFacory = new LuxuryTravePackage();
		AbstractFactoryTravelAgencyApp luxurytrip =  new AbstractFactoryTravelAgencyApp(LuxuryFacory);
		luxurytrip.showPackageDetails();
		
		
		TravelPackageFactory BudgetFacory = new BudgetTravePackage();
		AbstractFactoryTravelAgencyApp budgetTrip =  new AbstractFactoryTravelAgencyApp(BudgetFacory);
		budgetTrip.showPackageDetails();
		

	}
}
