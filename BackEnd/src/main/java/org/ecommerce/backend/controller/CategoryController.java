package org.ecommerce.backend.controller;

import org.ecommerce.backend.model.Category;
import org.ecommerce.backend.service.CategoryService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private SessionFactory sessionFactory;

    // Add a category
    @RequestMapping(value = "category/upload", method = RequestMethod.POST)
    public ResponseEntity<String> addCategory(@RequestParam("name") String name, @RequestParam("type") String type) {
        categoryService.save(name, type);
        // TODO: Redirect browser to /categories
        ResponseEntity<String> responseEntity= new ResponseEntity<>("Insert Success", HttpStatus.OK);
        return responseEntity;
    }

    // List all products
    @RequestMapping("/categories")
    public @ResponseBody
    List<Category> listProducts() {
        List<Category> products = categoryService.findAll();
        return products;
    }

    // Delete an existing category
    @RequestMapping(value = "/categories/{categoryId}/delete", method = RequestMethod.POST)
    public ResponseEntity<String> deleteCategory(@PathVariable int categoryId) {
        Category cat = categoryService.findById(categoryId);
        categoryService.delete(cat);
        ResponseEntity<String> responseEntity= new ResponseEntity<>("Delete Success", HttpStatus.OK);
        return responseEntity;
    }

    // Update an existing Product
    @RequestMapping(value = "/category/{categoryId}/update", method = RequestMethod.POST)
    public ResponseEntity<String> updateProduct(@PathVariable int categoryId, @RequestParam("name") String name, @RequestParam("type") String type) {
        Category product = categoryService.findById(categoryId);
        categoryService.updateProduct(product,name,type);
        ResponseEntity<String> responseEntity = new ResponseEntity<>("Category updated sucessfully",HttpStatus.OK);
        return responseEntity;
    }

}
