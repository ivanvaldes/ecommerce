package org.ecommerce.backend.dao;

import org.ecommerce.backend.model.Product;
import org.ecommerce.backend.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.io.IOException;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void save(Product product, MultipartFile file) {
            try {
                product.set(file.getBytes());
                productDao.save(gif);
            } catch (IOException e) {
                System.err.println("Unable to get byte array from uploaded file.");
            }
    }
}
