package com.example.JwtToken.services;

import com.example.JwtToken.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Harsh","harsh@gmail.com","harsh123"));
        store.add(new User(UUID.randomUUID().toString(),"Rahul","rahul@gmail.com","rahul123"));
        store.add(new User(UUID.randomUUID().toString(),"Gourav","gourav@gmail.com","gourav123"));
        store.add(new User(UUID.randomUUID().toString(),"Golu","golu@gmail.com","golu123"));

    }

    public List<User> getUsers(){
        return this.store;
    }
}
