package org.ecommerce.backend.service;

import org.ecommerce.backend.dao.CategoryDao;
import org.ecommerce.backend.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategotyserviceImpl implements CategoryService{

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public void save(String name, String type) {
        Category category = new Category();
        category.setName(name);
        category.setType(type);
        categoryDao.save(category);
    }
}
