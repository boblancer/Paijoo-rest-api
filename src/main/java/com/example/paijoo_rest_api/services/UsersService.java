package com.example.paijoo_rest_api.services;

import com.example.paijoo_rest_api.model.database.Users;

import java.util.ArrayList;

public interface UsersService {
    ArrayList<Users> getFriendListById(int id);
    Boolean registerUser(String username, String password, int id);
}
