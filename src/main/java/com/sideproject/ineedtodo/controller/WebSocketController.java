package com.sideproject.ineedtodo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.sideproject.ineedtodo.model.Message;

@Controller
public class WebSocketController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/message")
    public Message sendMessage(Message message) throws Exception {
        return message;
    }
}
