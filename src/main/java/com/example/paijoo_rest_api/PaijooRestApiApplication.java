package com.example.paijoo_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.paijoo_rest_api.repositories")
@SpringBootApplication
public class PaijooRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaijooRestApiApplication.class, args);
    }

}
