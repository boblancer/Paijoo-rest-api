package com.example.paijoo_rest_api.services;

//import com.sun.org.apache.xpath.internal.operations.Bool;

import com.example.paijoo_rest_api.model.Conversation;
import com.example.paijoo_rest_api.model.database.Messages;

import java.sql.Timestamp;
import java.util.ArrayList;

public interface MessagesService {
    ArrayList<Conversation> findUnreceivedMessages(int id);
    Boolean createMessage(Messages m);
}
