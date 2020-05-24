package org.ecommerce.backend.dao;

import org.ecommerce.backend.model.Product;
import org.springframework.web.multipart.MultipartFile;


public interface ProductDao {
    void save(Product product);
}
