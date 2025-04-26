package com.viva.dev.patterns.creational.abstractfactory;

//Concrete Factories
public class BudgetTravePackage implements TravelPackageFactory{

	@Override
	public Cruise createCruise() {
		return new BudgetCruise();
	}

	@Override
	public Flight createFlight() {
		return new BudgetFlight();
	}

}
