
package com.solace.demo.sohealthy;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientAlertSchema {

	public PatientAlertSchema () {
	}
	public PatientAlertSchema (
		String dateTime, 
		String alertMessage, 
		String patientId, 
		String messageId) {
		this.dateTime = dateTime;
		this.alertMessage = alertMessage;
		this.patientId = patientId;
		this.messageId = messageId;
	}


	private String dateTime;
	private String alertMessage;
	private String patientId;
	private String messageId;

	public String getDateTime() {
		return dateTime;
	}

	public PatientAlertSchema setDateTime(String dateTime) {
		this.dateTime = dateTime;
		return this;
	}


	public String getAlertMessage() {
		return alertMessage;
	}

	public PatientAlertSchema setAlertMessage(String alertMessage) {
		this.alertMessage = alertMessage;
		return this;
	}


	public String getPatientId() {
		return patientId;
	}

	public PatientAlertSchema setPatientId(String patientId) {
		this.patientId = patientId;
		return this;
	}


	public String getMessageId() {
		return messageId;
	}

	public PatientAlertSchema setMessageId(String messageId) {
		this.messageId = messageId;
		return this;
	}


	public String toString() {
		return "PatientAlertSchema ["
		+ " dateTime: " + dateTime
		+ " alertMessage: " + alertMessage
		+ " patientId: " + patientId
		+ " messageId: " + messageId
		+ " ]";
	}
}

