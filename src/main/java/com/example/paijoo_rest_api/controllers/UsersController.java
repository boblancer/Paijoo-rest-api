package com.example.paijoo_rest_api.controllers;

import com.example.paijoo_rest_api.model.RequestBody.CreateUserRequest;
import com.example.paijoo_rest_api.model.RequestBody.SendMessage;
import com.example.paijoo_rest_api.model.RequestBody.TextContentRequestBody;
import com.example.paijoo_rest_api.services.MessagesService;
import com.example.paijoo_rest_api.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping(MessagesController.BASE_URL)
public class UsersController {
    public static final String BASE_URL = "/users";

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping("/create")
    CreateUserRequest send(@RequestBody CreateUserRequest req){
        usersService.
        return req;

    }
}