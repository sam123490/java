package com.caresoft.clinicapp;

public class Physician extends User implements HIPAACompliantUser {
	
	public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public boolean assignPIN(int pin) {
		if(pin.length == 4) {
			
		}
		this.pin = pin;
	}
	
}
