package com.viva.dev.patterns.creational.abstractfactory;

//Concrete Products
public class BudgetFlight implements Flight {

	@Override
	public void getDetails() {
		System.out.println("Economy, Free Meal");
		
	}

	@Override
	public void getName() {
		System.out.println("Budget Flight");
	}
}
