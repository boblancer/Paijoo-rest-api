package com.example.paijoo_rest_api.controllers;

import com.example.paijoo_rest_api.model.Conversation;
import com.example.paijoo_rest_api.model.Messages;
import com.example.paijoo_rest_api.model.RequestBody.MessagesByConversationId;
import com.example.paijoo_rest_api.services.MessagesService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(MessagesController.BASR_URL)
public class MessagesController {

    public static final String BASR_URL = "/messages";

    private final MessagesService messagesService;

    public MessagesController(MessagesService messagesService) {
        this.messagesService = messagesService;
    }

    @RequestMapping(value="/get", method = RequestMethod.GET)
    ArrayList<Conversation>  findUnreceivedMessages(@RequestBody MessagesByConversationId req){
        System.out.println(req);
        return messagesService.findUnreceivedMessages(req.getUser_id());

    }

}
