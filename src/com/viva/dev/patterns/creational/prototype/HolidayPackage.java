package com.viva.dev.patterns.creational.prototype;

//concrete classes
public class HolidayPackage implements TravelPackage{

	private String destination;
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public void setMealPlan(String mealPlan) {
		this.mealPlan = mealPlan;
	}

	private String hotel;
	private String transport;
	private String mealPlan;
	
	public HolidayPackage(String destination, String hotel, String transport,String mealPlan) {
		this.destination = destination;
		this.hotel = hotel;
		this.transport = transport;		
		this.mealPlan = mealPlan;

	}
	
	@Override
	public TravelPackage clone() {
		try {
			return (TravelPackage) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void showDetails() {
		System.out.println(destination +" -"+hotel+" -"+transport+" -"+mealPlan);		
	}

}
