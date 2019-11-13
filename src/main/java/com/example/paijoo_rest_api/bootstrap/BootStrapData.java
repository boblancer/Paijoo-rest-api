package com.example.paijoo_rest_api.bootstrap;


import com.example.paijoo_rest_api.model.Messages;
import com.example.paijoo_rest_api.repositories.MessagesRepository;
import org.springframework.boot.CommandLineRunner;

public class BootStrapData implements CommandLineRunner {

    private final MessagesRepository messagesRepository;

    public BootStrapData(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
