package com.example.paijoo_rest_api.services;

import com.example.paijoo_rest_api.model.Messages;
import com.example.paijoo_rest_api.repositories.MessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class MessagesServiceImpl implements MessagesService {
    @Autowired
    private final MessagesRepository messagesRepository;

    public MessagesServiceImpl(MessagesRepository messagesRepository){
        this.messagesRepository = messagesRepository;
    }
    @Override
    public List<Messages> findMessageBetweenUsersById(Long user_id, Long participant_id, Timestamp lastMessageReceived){
        System.out.println(messagesRepository.findAll());
        return messagesRepository.findAll();
    }

    @Override
    public Boolean createMessage(Long user_id, Long participant_id, Timestamp lastMessageReceived) {
        return null;
    }
}
