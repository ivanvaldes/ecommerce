package org.ecommerce.backend.service;

import org.ecommerce.backend.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void save(String name, String description, MultipartFile image);

    Product findById(int productId);

    void delete(Product product);

    void updateProduct(Product product, String name, String description, MultipartFile image);
}
