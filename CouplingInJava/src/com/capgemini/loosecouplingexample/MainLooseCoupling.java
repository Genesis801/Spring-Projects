package com.capgemini.loosecouplingexample;

public class MainLooseCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traveller t=new Traveller();
		//dependency Injection
		t.setV(new Car());
		t.startJourney();
		
		t.setV(new Bus());
		t.startJourney();
		
		t.setV(new Flight());
		t.startJourney();
	}

}
