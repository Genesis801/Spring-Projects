package com.capgemini.tightcouplingexample;

public class Traveller {

	Car c=new Car();
	public void startJourney() {
		c.move();
		System.out.println("Journey started");
	}
}
