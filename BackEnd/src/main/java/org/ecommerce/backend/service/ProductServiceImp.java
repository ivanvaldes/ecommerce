package org.ecommerce.backend.service;

import org.ecommerce.backend.dao.ProductDao;
import org.ecommerce.backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public void save(String name, String description, MultipartFile image) {
        try {
            Product product = new Product();
            product.setName(name);
            product.setDescription(description);
            product.setImage(image.getBytes());
            productDao.save(product);
        } catch (IOException e) {
            System.err.println("Unable to get byte array from uploaded file.");
        }
    }
}
