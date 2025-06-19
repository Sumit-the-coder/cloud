package com.clouds.controller;

import com.clouds.db.entity.User;
import com.clouds.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
