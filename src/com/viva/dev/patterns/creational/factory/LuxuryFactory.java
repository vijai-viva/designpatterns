package com.viva.dev.patterns.creational.factory;

//Concrete factories
public class LuxuryFactory extends CruiseFactory{

	@Override
	public Cruise createCruise() {
		return new LuxuryCruise();
	}

}
