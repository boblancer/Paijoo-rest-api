package com.example.paijoo_rest_api.services;

//import com.sun.org.apache.xpath.internal.operations.Bool;

import com.example.paijoo_rest_api.model.Conversation;
import com.example.paijoo_rest_api.model.Messages;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface MessagesService {
    Map<Integer, List<Messages>> findUnreceivedMessages(int id);
    ArrayList<Integer> findAllUnreceivedConversationIdByUserId(int id);
    Boolean createMessage(Long user_id, Long participant_id,
                          Timestamp lastMessageReceived);
}
