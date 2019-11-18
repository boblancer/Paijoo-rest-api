package com.example.paijoo_rest_api.repositories;

import com.example.paijoo_rest_api.model.database.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface MessagesRepository extends JpaRepository<Messages, Long> {
    @Query(value="SELECT * FROM messages m " +
            "where m.received = FALSE and m.recipient_id = :recipient_id"
            , nativeQuery = true)
    ArrayList<Messages> findUnreceivedMessages(
            @Param("recipient_id") int recipient_id);

    @Query(value="SELECT * FROM messages m " +
            "join text_content t on m.content_type = 1 " +
            "where (m.received = FALSE and m.conversation_id = :conversation_id) " +
            "ORDER BY m.created_at", nativeQuery = true)
    ArrayList<Messages> findUnreceivedMessagesByConversationId(
            @Param("conversation_id") int conversation_id);

}
