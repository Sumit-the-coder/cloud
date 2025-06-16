package com.clouds.service;

import com.clouds.db.entity.User;
import com.clouds.db.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
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
