package com.viva.dev.patterns.creational.prototype;

public interface TravelPackage extends Cloneable{

	public TravelPackage clone();
	public void showDetails();
}
