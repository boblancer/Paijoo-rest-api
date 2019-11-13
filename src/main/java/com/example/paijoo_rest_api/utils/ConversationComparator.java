package com.example.paijoo_rest_api.utils;

import com.example.paijoo_rest_api.model.Conversation;

import java.util.Comparator;

public class ConversationComparator implements Comparator<Conversation> {
    public int compare(Conversation c1, Conversation c2){
        return c1.getLastMessageTimestamp().compareTo(c2.getLastMessageTimestamp());
    }

}
