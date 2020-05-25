package org.ecommerce.backend.service;

import org.ecommerce.backend.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void save(String name, String type);
}
