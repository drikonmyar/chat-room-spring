package com.chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chat.dto.MessageDTO;
import com.chat.service.MessageService;

@RestController
@CrossOrigin
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@PostMapping("/chat")
	private List<MessageDTO> chat(@RequestBody MessageDTO messageDTO) {
		return messageService.chat(messageDTO);
	}

}
