package com.example.soa.service;

import com.example.soa.Model.User;

import java.util.List;


public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

}
