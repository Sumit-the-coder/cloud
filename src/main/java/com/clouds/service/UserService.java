package com.clouds.service;

import com.clouds.db.entity.User;
import com.clouds.db.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public List<User> getAllUser(){
        List<User> list = new ArrayList<>();
        Iterator<User> iterator = repo.findAll().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
}
