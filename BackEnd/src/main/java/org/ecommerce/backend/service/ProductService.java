package org.ecommerce.backend.service;

import org.ecommerce.backend.model.Product;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    void save(Product product, MultipartFile file);
}
