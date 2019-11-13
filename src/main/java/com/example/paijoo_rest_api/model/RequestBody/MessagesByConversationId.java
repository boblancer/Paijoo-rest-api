package com.example.paijoo_rest_api.model.RequestBody;

import lombok.Data;

@Data
public class MessagesByConversationId {
    private int user_id;
    private String access_token;
}
