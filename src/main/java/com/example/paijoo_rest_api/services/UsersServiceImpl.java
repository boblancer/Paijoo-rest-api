package com.example.paijoo_rest_api.services;

import com.example.paijoo_rest_api.model.database.Users;
import com.example.paijoo_rest_api.repositories.MessagesRepository;
import com.example.paijoo_rest_api.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private final UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @Override
    public ArrayList<Users> getFriendListById(int id) {

        return usersRepository.getFriendListById(id);
    }

    @Override
    public Boolean registerUser(String username, String password) {
        usersRepository.createUser(username, password);
        return Boolean.TRUE;
    }
}
