package org.ecommerce.backend.dao;

import org.ecommerce.backend.model.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> findAll();
    void save(Category category);
    Category findById(int categoryId);

    void delete(Category category);

    void update(Category category);
}
