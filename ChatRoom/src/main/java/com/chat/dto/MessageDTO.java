package com.chat.dto;

import com.chat.entity.MessageEntity;

public class MessageDTO {
	
	private String username;
	
	private String messageContent;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	
	public MessageEntity convertToEntity(MessageDTO messageDTO) {
		MessageEntity messageEntity = new MessageEntity();
		messageEntity.setUsername(messageDTO.getUsername());
		messageEntity.setMessageContent(messageDTO.getMessageContent());
		return messageEntity;
	}
	
	public void convertToDTO(MessageEntity messageEntity, MessageDTO messageDTO) {
		messageDTO.setUsername(messageEntity.getUsername());
		messageDTO.setMessageContent(messageEntity.getMessageContent());
	}

}
