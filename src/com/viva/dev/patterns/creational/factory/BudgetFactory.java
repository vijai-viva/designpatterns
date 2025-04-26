package com.viva.dev.patterns.creational.factory;

public class BudgetFactory extends CruiseFactory{

	@Override
	public Cruise createCruise() {
		return new BudgetCruise();
	}
	
}
