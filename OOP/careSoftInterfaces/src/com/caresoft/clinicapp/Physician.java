package com.caresoft.clinicapp;
import java.sql.Date;
import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser {
	  private ArrayList<String> patientNotes;
	
	public Physician(Integer id) {
		super(id);
	}
	
	public boolean assignPin(int pin) {
		int numDigits = String.valueOf(pin).length();
		if(numDigits == 4) {
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
			return false;
		}
	}
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
    
    public String getPatientNote(int index){
    	return patientNotes.get(index);
    }
}
