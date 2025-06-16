package com.clouds.service;

import com.clouds.db.entity.User;
import com.clouds.db.repo.UserRepository;

public class UserService {
    private UserRepository repo;

    public void save(User user){
        repo.save(user);
    }

    public User getUser(User user){
        return repo.findById(user.getId()).get();
    }

    public void deleteUser(User user){
        repo.delete(user);
    }

}
