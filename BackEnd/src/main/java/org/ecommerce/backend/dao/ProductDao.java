package org.ecommerce.backend.dao;

import org.ecommerce.backend.model.Product;

import java.util.List;


public interface ProductDao {
    void save(Product product);
    List<Product> findAll();

    Product findById(int productId);

    void delete(Product product);

    void update(Product product);
}
