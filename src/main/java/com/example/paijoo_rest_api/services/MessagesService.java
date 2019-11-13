package com.example.paijoo_rest_api.services;

//import com.sun.org.apache.xpath.internal.operations.Bool;

import com.example.paijoo_rest_api.model.Conversation;
import com.example.paijoo_rest_api.model.Messages;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public interface MessagesService {
    ArrayList<Conversation> findUnreceivedMessages(int id);
    ArrayList<Integer> findAllUnreceivedConversationIdByUserId(int id);
    Boolean createMessage(Long user_id, Long participant_id,
                          Timestamp lastMessageReceived);
}
