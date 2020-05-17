package org.ecommerce.backend.controller;

import org.ecommerce.backend.model.User;
import org.ecommerce.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    // List all users
    @RequestMapping("/users")
    public List<User> listUsers() {
        // TODO: Get all gifs
        List<User> users = userService.findAll();
        return users;
    }
}
