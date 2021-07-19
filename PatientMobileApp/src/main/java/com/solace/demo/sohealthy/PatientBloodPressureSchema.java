
package com.solace.demo.sohealthy;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientBloodPressureSchema {

	public PatientBloodPressureSchema () {
	}
	public PatientBloodPressureSchema (
		String dateTime, 
		Integer bloodPressure, 
		String patientId, 
		String messageId) {
		this.dateTime = dateTime;
		this.bloodPressure = bloodPressure;
		this.patientId = patientId;
		this.messageId = messageId;
	}


	private String dateTime;
	private Integer bloodPressure;
	private String patientId;
	private String messageId;

	public String getDateTime() {
		return dateTime;
	}

	public PatientBloodPressureSchema setDateTime(String dateTime) {
		this.dateTime = dateTime;
		return this;
	}


	public Integer getBloodPressure() {
		return bloodPressure;
	}

	public PatientBloodPressureSchema setBloodPressure(Integer bloodPressure) {
		this.bloodPressure = bloodPressure;
		return this;
	}


	public String getPatientId() {
		return patientId;
	}

	public PatientBloodPressureSchema setPatientId(String patientId) {
		this.patientId = patientId;
		return this;
	}


	public String getMessageId() {
		return messageId;
	}

	public PatientBloodPressureSchema setMessageId(String messageId) {
		this.messageId = messageId;
		return this;
	}


	public String toString() {
		return "PatientBloodPressureSchema ["
		+ " dateTime: " + dateTime
		+ " bloodPressure: " + bloodPressure
		+ " patientId: " + patientId
		+ " messageId: " + messageId
		+ " ]";
	}
}

