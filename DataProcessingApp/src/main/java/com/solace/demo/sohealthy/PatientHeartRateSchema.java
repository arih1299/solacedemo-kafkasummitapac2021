
package com.solace.demo.sohealthy;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientHeartRateSchema {

	public PatientHeartRateSchema () {
	}
	public PatientHeartRateSchema (
		String dateTime, 
		String patientId, 
		String messageId, 
		Integer heartRatePerMinute) {
		this.dateTime = dateTime;
		this.patientId = patientId;
		this.messageId = messageId;
		this.heartRatePerMinute = heartRatePerMinute;
	}


	private String dateTime;
	private String patientId;
	private String messageId;
	private Integer heartRatePerMinute;

	public String getDateTime() {
		return dateTime;
	}

	public PatientHeartRateSchema setDateTime(String dateTime) {
		this.dateTime = dateTime;
		return this;
	}


	public String getPatientId() {
		return patientId;
	}

	public PatientHeartRateSchema setPatientId(String patientId) {
		this.patientId = patientId;
		return this;
	}


	public String getMessageId() {
		return messageId;
	}

	public PatientHeartRateSchema setMessageId(String messageId) {
		this.messageId = messageId;
		return this;
	}


	public Integer getHeartRatePerMinute() {
		return heartRatePerMinute;
	}

	public PatientHeartRateSchema setHeartRatePerMinute(Integer heartRatePerMinute) {
		this.heartRatePerMinute = heartRatePerMinute;
		return this;
	}


	public String toString() {
		return "PatientHeartRateSchema ["
		+ " dateTime: " + dateTime
		+ " patientId: " + patientId
		+ " messageId: " + messageId
		+ " heartRatePerMinute: " + heartRatePerMinute
		+ " ]";
	}
}

