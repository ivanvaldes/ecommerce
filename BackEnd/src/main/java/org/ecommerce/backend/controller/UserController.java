package org.ecommerce.backend.controller;

import org.ecommerce.backend.model.User;
import org.ecommerce.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    // List all users
    //@RequestMapping(value = "/user", produces = {"application/json"})
    @RequestMapping("/user")
    public @ResponseBody List<User> listUsers() {
        List<User> users = userService.findAll();
        return users;
    }
}