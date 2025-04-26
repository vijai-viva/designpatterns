package com.viva.dev.patterns.creational.Singleton;

public final class Singleton {

	public String text;
	private static Singleton instance;
	
	private Singleton(String text) {
		this.text=text;
	}
	
	public static Singleton getInstance(String text) { 
		if(instance == null) { 
			instance = new Singleton(text);
		}	
		return instance;
	}
}


