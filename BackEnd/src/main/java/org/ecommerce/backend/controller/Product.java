package org.ecommerce.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Product {
    @RequestMapping("/")
    public String home() {
        return "Hello word";
    }
}
