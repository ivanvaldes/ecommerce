package org.ecommerce.backend.service;

import org.ecommerce.backend.dao.ProductDao;
import org.ecommerce.backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductDao productDao;


    @Override
    public void save(Product product, MultipartFile file) {
        try {
            product.setImage(file.getBytes());
            productDao.save(product);
        } catch (IOException e) {
            System.err.println("Unable to get byte array from uploaded file.");
        }
    }
}
