package com.viva.dev.patterns.creational.abstractfactory;

public class LuxuryTravePackage implements TravelPackageFactory{

	@Override
	public Cruise createCruise() {
		return new LuxuryCruise();
	}

	@Override
	public Flight createFlight() {
		return new LuxuryFlight();
	}

}
