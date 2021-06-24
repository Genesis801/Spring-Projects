package com.capgemini.loosecouplingexample;

public class Traveller {

	private Vehicle v;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	public void startJourney() {
		v.move();
		System.out.println("Journey started...");
	}
}
