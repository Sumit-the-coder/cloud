package com.clouds.controller;

import com.clouds.db.entity.User;
import com.clouds.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private static final Logger logger = LogManager.getLogger(UserController.class);
    private UserService userService;

    @PostMapping("/save")
    public void save(@RequestBody User user){
        logger.debug("User saving");
        userService.save(user);
        logger.debug("User saved");
    }
}
