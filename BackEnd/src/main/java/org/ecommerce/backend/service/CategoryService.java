package org.ecommerce.backend.service;

import org.ecommerce.backend.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void save(String name, String type);

    Category findById(int categoryId);

    void delete(Category category);

    void updateProduct(Category category, String name, String type);
}
