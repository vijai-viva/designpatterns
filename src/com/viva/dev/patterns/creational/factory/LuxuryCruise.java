package com.viva.dev.patterns.creational.factory;


// Concrete Products
public class LuxuryCruise implements Cruise {

	@Override
	public void getDetails() {
		System.out.println("7 days trip, 3 destination, private suite, all free dining");
		
	}

	@Override
	public void getName() {
		System.out.println("Star Cruise");
	}

}
