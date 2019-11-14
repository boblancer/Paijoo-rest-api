package com.example.paijoo_rest_api.services;

import com.example.paijoo_rest_api.model.Conversation;
import com.example.paijoo_rest_api.model.Messages;
import com.example.paijoo_rest_api.repositories.MessagesRepository;
import com.example.paijoo_rest_api.utils.ConversationComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

import static java.util.stream.Collectors.groupingBy;

@Service
public class MessagesServiceImpl implements MessagesService {
    @Autowired
    private final MessagesRepository messagesRepository;

    public MessagesServiceImpl(MessagesRepository messagesRepository){
        this.messagesRepository = messagesRepository;
    }
    @Override

    public Map<Integer, List<Messages>> findUnreceivedMessages(int id){
        ArrayList<Messages> unreceivedMessages = messagesRepository.findUnreceivedMessages(id);

        //System.out.println(conversations);
        //conversations.sort(new ConversationComparator());
        Map<Integer, List<Messages>> messagePerConversation = unreceivedMessages.stream()
                .collect(groupingBy(Messages::getConversation_id));
        System.out.println(messagePerConversation);
        ArrayList<Conversation> result = new ArrayList<Conversation>();
        result.add(new Conversation(unreceivedMessages));
        return messagePerConversation;
    }

    @Override
    public ArrayList<Integer> findAllUnreceivedConversationIdByUserId(int id) {
        //LinkedHashSet<Integer> conversationIds = new LinkedHashSet<>(
                //messagesRepository.findConversationIdWithUnreceivedMessages(id));
        //ArrayList<Integer> unique_conversationIds = new ArrayList<Integer>(conversationIds);
        return null;
    }


    @Override
    public Boolean createMessage(Long user_id, Long participant_id, Timestamp lastMessageReceived) {
        return null;
    }
}
