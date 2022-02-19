package com.TruemedsAssignment.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "basant_rawat_java_output")
public class FinalOutputDetails {

@Id
String outputString;

int countToFinalString;

String timeStamp;

public FinalOutputDetails() {}

public FinalOutputDetails(String outputString, int countToFinalString, String timeStamp) {
	this.outputString = outputString;
	this.countToFinalString = countToFinalString;
	this.timeStamp = timeStamp;
}

public String getOutputString() {
	return outputString;
}
public void setOutputString(String outputString) {
	this.outputString = outputString;
}
public int getCountToFinalString() {
	return countToFinalString;
}
public void setCountToFinalString(int countToFinalString) {
	this.countToFinalString = countToFinalString;
}
public String getDate() {
	return timeStamp;
}
public void setDate(String timeStamp) {
	this.timeStamp = timeStamp;
}
@Override
public String toString() {
	return "FinalOutputDetails [outputString=" + outputString + ", countToFinalString=" + countToFinalString + ", date="
			+ timeStamp + "]";
}
}