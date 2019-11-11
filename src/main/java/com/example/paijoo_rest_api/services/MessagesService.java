package com.example.paijoo_rest_api.services;

import com.example.paijoo_rest_api.model.Messages;
//import com.sun.org.apache.xpath.internal.operations.Bool;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public interface MessagesService {
    List<Messages> findMessageBetweenUsersById(Long user_id, Long participant_id,
                                               Timestamp lastMessageReceived);
    Boolean createMessage(Long user_id, Long participant_id,
                          Timestamp lastMessageReceived);
}
