package com.TruemedsAssignment.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "input_details")
public class InputStringDetails {

	
	@Id
	private String inputString;

	protected InputStringDetails() {}
	
	public InputStringDetails(String inputString) {
		this.inputString = inputString;
	}

	public String getInputString() {
		return inputString;
	}

	public void setInputString(String inputString) {
		this.inputString = inputString;
	}
	
	@Override
	public String toString() {
		return "InputStringDetails [inputString=" + inputString + "]";
	}
	
}
	


