package com.chat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.dto.MessageDTO;
import com.chat.entity.MessageEntity;
import com.chat.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository messageRepository;
	
	public List<MessageDTO> chat(MessageDTO messageDTO){
		if(!messageDTO.getMessageContent().isEmpty()) {
			messageRepository.save(messageDTO.convertToEntity(messageDTO));
		}
		List<MessageEntity> allChats = messageRepository.findAll();
		List<MessageDTO> allChatsToDTO = new ArrayList<>();
		for(int i=0;i<allChats.size();i++) {
			MessageDTO chatDTO = new MessageDTO();
			chatDTO.convertToDTO(allChats.get(i), chatDTO);
			allChatsToDTO.add(chatDTO);
		}
		return allChatsToDTO;
	}
	

}
