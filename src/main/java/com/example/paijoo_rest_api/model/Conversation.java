package com.example.paijoo_rest_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Calendar;

@Data
@AllArgsConstructor
public class Conversation {
    int Conversation_id;
    ArrayList<Messages> messages;
    public Calendar getLastMessageTimestamp(){
        if (messages != null) {
            Calendar c = messages.get(messages.size() - 1).getCreated_at();
            return c;
        }
        return null;
    }
}
