package com.viva.dev.patterns.creational.abstractfactory;

public interface TravelPackageFactory {
	Cruise createCruise();
	Flight createFlight();
}
