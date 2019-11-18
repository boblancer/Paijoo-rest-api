package com.example.paijoo_rest_api.controllers;
import com.example.paijoo_rest_api.model.RequestBody.CreateUserRequest;
import com.example.paijoo_rest_api.model.database.Users;
import com.example.paijoo_rest_api.services.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@CrossOrigin
@RestController
@RequestMapping(UsersController.BASE_URL)
public class UsersController {
    public static final String BASE_URL = "/users";

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping("/create")
    CreateUserRequest createUser(@RequestBody CreateUserRequest req){
        usersService.registerUser(req.getUsername(), req.getPassword(), req.getId());
        return req;
    }

    @GetMapping("/{id}/friends")
    ArrayList<Users> getFriendlist(@PathVariable("id") int id ){
        return usersService.getFriendListById(id);
    }

    @GetMapping("/hello")
    String UserHello(){
        return "Hello from user controller";

    }
}