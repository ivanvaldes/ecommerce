package org.ecommerce.backend.dao;

import org.ecommerce.backend.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


@Repository
public class CategotyDaoImpl implements CategoryDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<Category> findAll() {
        // Open a session
        Session session = sessionFactory.openSession();

        // Create CriteriaBuilder
        CriteriaBuilder builder = session.getCriteriaBuilder();

        // Create CriteriaQuery
        CriteriaQuery<Category> criteria = builder.createQuery(Category.class);

        // Specify criteria root
        criteria.from(Category.class);

        // Execute query
        List<Category> categories = session.createQuery(criteria).getResultList();

        // Close session
        session.close();

        return categories;
    }

    @Override
    public void save(Category category) {
        // Open a session
        Session session = sessionFactory.openSession();

        // Begin a transaction
        session.beginTransaction();

        // Save the category
        session.saveOrUpdate(category);

        // Commit the transaction
        session.getTransaction().commit();

        // Close the session
        session.close();
    }
}
