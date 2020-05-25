package org.ecommerce.backend.controller;

import org.ecommerce.backend.model.Category;
import org.ecommerce.backend.service.CategoryService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping(value = "/uploadCategory", method = RequestMethod.POST)
    public ResponseEntity<String> addCategory(@RequestParam("name") String name, @RequestParam("type") String type) {
        categoryService.save(name, type);
        // TODO: Redirect browser to /categories
        ResponseEntity<String> responseEntity= new ResponseEntity<>("Insert Success", HttpStatus.OK);
        return responseEntity;
    }

}
