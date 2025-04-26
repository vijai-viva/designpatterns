package com.viva.dev.patterns.creational.abstractfactory;

//Concrete Products
public class BudgetCruise implements Cruise {

	@Override
	public void getDetails() {
		System.out.println("3 days trip, 1 destination, shared suite, free Breakfst");
		
	}

	@Override
	public void getName() {
		System.out.println("Budget Cruise");
	}
}
