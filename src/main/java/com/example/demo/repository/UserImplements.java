package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserImplements implements  UserRepostory {
    private HashMap<Integer, User> userHashMap = new HashMap<>();


    @Override
    public HashMap<Integer, User> findAllUser() {
        return userHashMap;
    }

    @Override
    public User findUserById(Integer idUser) {
        return userHashMap.get(idUser);
    }

    @Override
    public User createUser(User user) {
        Integer idUser = user.getIdUser();
        return userHashMap.put(idUser, user);
    }

    @Override
    public User updateUser(Integer id, User user) {
        return userHashMap.put(id, user);
    }

    @Override
    public User deleteUser(Integer id) {
        return userHashMap.remove(id);
    }
}
