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
        Messages t1 = new Messages();
        t1.setAuthor_id(1);
        t1.setAuthor_id(1);
        t1.setRecipient_id(2);
        messagesRepository.save(t1);
    }
}
