
package com.solace.demo.sohealthy;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatMessageSchema {

	public ChatMessageSchema () {
	}
	public ChatMessageSchema (
		String dateTime, 
		String senderId, 
		String receiverId, 
		String messageId, 
		String chatMessage) {
		this.dateTime = dateTime;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.messageId = messageId;
		this.chatMessage = chatMessage;
	}


	private String dateTime;
	private String senderId;
	private String receiverId;
	private String messageId;
	private String chatMessage;

	public String getDateTime() {
		return dateTime;
	}

	public ChatMessageSchema setDateTime(String dateTime) {
		this.dateTime = dateTime;
		return this;
	}


	public String getSenderId() {
		return senderId;
	}

	public ChatMessageSchema setSenderId(String senderId) {
		this.senderId = senderId;
		return this;
	}


	public String getReceiverId() {
		return receiverId;
	}

	public ChatMessageSchema setReceiverId(String receiverId) {
		this.receiverId = receiverId;
		return this;
	}


	public String getMessageId() {
		return messageId;
	}

	public ChatMessageSchema setMessageId(String messageId) {
		this.messageId = messageId;
		return this;
	}


	public String getChatMessage() {
		return chatMessage;
	}

	public ChatMessageSchema setChatMessage(String chatMessage) {
		this.chatMessage = chatMessage;
		return this;
	}


	public String toString() {
		return "ChatMessageSchema ["
		+ " dateTime: " + dateTime
		+ " senderId: " + senderId
		+ " receiverId: " + receiverId
		+ " messageId: " + messageId
		+ " chatMessage: " + chatMessage
		+ " ]";
	}
}

