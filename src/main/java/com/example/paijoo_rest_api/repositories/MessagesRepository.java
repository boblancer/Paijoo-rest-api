package com.example.paijoo_rest_api.repositories;

import com.example.paijoo_rest_api.model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Messages, Long> {
}
