package com.viva.dev.patterns.Demo;

import com.viva.dev.patterns.creational.factory.BudgetFactory;
import com.viva.dev.patterns.creational.factory.CruiseFactory;
import com.viva.dev.patterns.creational.factory.LuxuryFactory;

public class FactoryMethodCruiseApp {

	public static void main(String[] args) {
		CruiseFactory factory;
		
		factory = new LuxuryFactory();
		factory.bookCruise();
		
	}
}
