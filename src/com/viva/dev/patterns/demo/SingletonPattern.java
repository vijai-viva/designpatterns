package com.viva.dev.patterns.demo;

import com.viva.dev.patterns.creational.Singleton.Singleton;

public class SingletonPattern {

	public static void main(String[] args) {
		Singleton insFirst = Singleton.getInstance("Cruise");
		Singleton insSecond = Singleton.getInstance("Flight");
		
		System.out.println(insFirst.text);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(insSecond.text);
		
		
	}
}
