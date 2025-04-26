package com.viva.dev.patterns.Demo;

import com.viva.dev.patterns.creational.prototype.HolidayPackage;

public class PrototypeTravelPackBooking {

	
	public static void main(String[] args) {
		HolidayPackage econoPack = new HolidayPackage("cancun", "hilton", "cruise", "economy");
		
		HolidayPackage ecnoCustom = (HolidayPackage)econoPack.clone();
		ecnoCustom.setHotel("holidayin");
		econoPack.showDetails();
		ecnoCustom.showDetails();
		
	}
}
