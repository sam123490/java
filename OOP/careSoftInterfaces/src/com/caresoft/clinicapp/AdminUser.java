package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private String role;
	private ArrayList<String> securityIncidents = new ArrayList<String>();
	
	public AdminUser(Integer id, String role) {
		super(id);
		this.role = role;
	}
	
	public boolean assignPin(int pin) {
		int numDigits = String.valueOf(pin).length();
		if(numDigits == 6) {
			setPin(pin);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(getId() == confirmedAuthID) {			
			return true;
		}
		else {
			authIncident();
			return false;
		}
	}
	
	public ArrayList<String> reportSecurityIncidents(){
		return securityIncidents;
	}
	
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
}
