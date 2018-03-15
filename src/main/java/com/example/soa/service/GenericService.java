package com.example.soa.service;

import java.util.List;

import com.example.soa.model.User;


public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    User findById(long id);

    boolean isUserExist(User user);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    void deleteAllUsers();
}
