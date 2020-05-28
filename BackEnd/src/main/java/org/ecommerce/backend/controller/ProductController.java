package org.ecommerce.backend.controller;

import org.ecommerce.backend.model.Product;
import org.ecommerce.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    // Upload a new Product
    @RequestMapping(value = "/products/upload", method = RequestMethod.POST)
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

    // List a single product page
    @RequestMapping(value = "/products/{productId}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Product productDetail(@PathVariable int productId) {
        Product product = productService.findById(productId);
        return product;
    }

    // Delete an existing product
    @RequestMapping(value = "/products/{productId}/delete", method = RequestMethod.POST)
    public ResponseEntity<String> deleteProduct(@PathVariable int productId) {
        Product product = productService.findById(productId);
        productService.delete(product);
        ResponseEntity<String> responseEntity = new ResponseEntity<>("Product deleted sucessfully",HttpStatus.OK);
        return responseEntity;
    }

    // Update an existing Product
    @RequestMapping(value = "/products/{productId}/update", method = RequestMethod.POST)
    public ResponseEntity<String> updateProduct(@PathVariable int productId, @RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("image") MultipartFile image) {
        Product product = productService.findById(productId);
        productService.updateProduct(product,name,description,image);
        ResponseEntity<String> responseEntity = new ResponseEntity<>("Product updated sucessfully",HttpStatus.OK);
        return responseEntity;
    }

}