package com.example.paijoo_rest_api.controllers;

import com.example.paijoo_rest_api.model.Conversation;
import com.example.paijoo_rest_api.model.RequestBody.SendMessage;
import com.example.paijoo_rest_api.model.RequestBody.TextContentRequestBody;
import com.example.paijoo_rest_api.services.MessagesService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping(MessagesController.BASE_URL)
public class MessagesController {

    public static final String BASE_URL = "/messages";

    private final MessagesService messagesService;

    public MessagesController(MessagesService messagesService) {
        this.messagesService = messagesService;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    ArrayList<Conversation> findUnreceivedMessages(@PathVariable("id") int id){
        System.out.println(id);
        return messagesService.findUnreceivedMessages(id);

    }
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    String hello(){
        return "Hello";
    }

    @PostMapping("/post")
    SendMessage<TextContentRequestBody> sendMessage(@RequestBody SendMessage<TextContentRequestBody> req){
        return req;

    }


}
