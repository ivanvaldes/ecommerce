package org.ecommerce.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
