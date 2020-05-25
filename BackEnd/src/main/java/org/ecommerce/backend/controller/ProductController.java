package org.ecommerce.backend.controller;

import org.ecommerce.backend.model.Product;
import org.ecommerce.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    // Upload a new Product
    @RequestMapping(value = "/uploadProduct", method = RequestMethod.POST)
    public ResponseEntity<String> addProduct(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("image") MultipartFile image) {
        productService.save(name,description,image);
        ResponseEntity<String> responseEntity = new ResponseEntity<>("Product uploaded sucessfully",HttpStatus.OK);
        return responseEntity;
    }

    // List all products
    @RequestMapping("/products")
    public @ResponseBody
    List<Product> listProducts() {
        List<Product> products = productService.findAll();
        return products;
    }

}