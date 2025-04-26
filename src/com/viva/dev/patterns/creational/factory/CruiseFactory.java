package com.viva.dev.patterns.creational.factory;


//Base Factory / abstract factory
public abstract class CruiseFactory {
	public abstract Cruise createCruise() ;
	
	public void bookCruise() {
		Cruise cruise = createCruise();
		cruise.getName();
		cruise.getDetails();
	}
}

