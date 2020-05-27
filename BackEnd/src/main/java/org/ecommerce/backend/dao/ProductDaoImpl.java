package org.ecommerce.backend.dao;

import org.ecommerce.backend.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

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

    @Override
    public List<Product> findAll() {
        // Open a session
        Session session = sessionFactory.openSession();
        // Create CriteriaBuilder
        CriteriaBuilder builder = session.getCriteriaBuilder();
        // Create CriteriaQuery
        CriteriaQuery<Product> criteria = builder.createQuery(Product.class);
        // Specify criteria root
        criteria.from(Product.class);
        // Execute query
        List<Product> products = session.createQuery(criteria).getResultList();
        // Close session
        session.close();

        return products;
    }

    @Override
    public Product findById(int productId) {
        Session session = sessionFactory.openSession();
        Product product = session.get(Product.class,productId);
        session.close();
        return product;
    }

    @Override
    public void delete(Product product) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(product);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Product product) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(product);
        session.getTransaction().commit();
        session.close();
    }
}
