package com.viva.dev.patterns.creational.abstractfactory;


// Concrete Products
public class LuxuryFlight implements Flight {

	@Override
	public void getDetails() {
		System.out.println("Business Class, Free executive Meal, Lounge Access");
		
	}

	@Override
	public void getName() {
		System.out.println("Starliner");
	}

}
