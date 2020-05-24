package org.ecommerce.backend.dao;

import org.ecommerce.backend.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao{
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @SuppressWarnings("unchecked")
    public void save(Product product) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(product);
        session.getTransaction().commit();
        session.close();
    }
}
