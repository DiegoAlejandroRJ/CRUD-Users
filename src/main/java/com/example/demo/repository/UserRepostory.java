package com.example.demo.repository;

import com.example.demo.model.User;

import java.util.HashMap;

public interface UserRepostory {


    HashMap<Integer, User> findAllUser();
    User findUserById(Integer idUser);
    User createUser(User user);
    User updateUser(Integer id, User user);
    User deleteUser(Integer id);

}
