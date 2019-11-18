package com.example.paijoo_rest_api.model.RequestBody;

import lombok.Data;

import javax.persistence.Column;

@Data
public class CreateUserRequest {

    private String username;
    private String password;

}
