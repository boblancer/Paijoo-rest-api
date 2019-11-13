package com.example.paijoo_rest_api.services;

import com.example.paijoo_rest_api.model.Conversation;
import com.example.paijoo_rest_api.model.Messages;
import com.example.paijoo_rest_api.repositories.MessagesRepository;
import com.example.paijoo_rest_api.utils.ConversationComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

@Service
public class MessagesServiceImpl implements MessagesService {
    @Autowired
    private final MessagesRepository messagesRepository;

    public MessagesServiceImpl(MessagesRepository messagesRepository){
        this.messagesRepository = messagesRepository;
    }
    @Override
    public ArrayList<Conversation> findUnreceivedMessages(int id){
        ArrayList<Integer> conversationIds = this.findAllUnreceivedConversationIdByUserId(id);
        ArrayList<Conversation> conversations = new ArrayList<>();
        for(Integer n: conversationIds){
            ArrayList<Messages> m = messagesRepository.findUnreceivedMessagesByConversationId(n);
            Conversation c = new Conversation(m);
            conversations.add(c);
        }
        System.out.println(conversations);
        conversations.sort(new ConversationComparator());
        return conversations;
    }

    @Override
    public ArrayList<Integer> findAllUnreceivedConversationIdByUserId(int id) {
        LinkedHashSet<Integer> conversationIds = new LinkedHashSet<>(
                messagesRepository.findConversationIdWithUnreceivedMessages(id));
        ArrayList<Integer> unique_conversationIds = new ArrayList<Integer>(conversationIds);
        return unique_conversationIds;
    }


    @Override
    public Boolean createMessage(Long user_id, Long participant_id, Timestamp lastMessageReceived) {
        return null;
    }
}
