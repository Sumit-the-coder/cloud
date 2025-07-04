package com.clouds.controller;

import com.clouds.db.entity.User;
import com.clouds.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController {
    private static final Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public void save(@RequestBody User user){
        logger.info("User saving");
        userService.save(user);
        logger.info("User saved");
    }

    @GetMapping("/get")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable long id){
        logger.info("User deleting");
        userService.deleteUserById(id);
        logger.info("User deleted");
    }
}
