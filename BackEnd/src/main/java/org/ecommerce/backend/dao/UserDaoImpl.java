package org.ecommerce.backend.dao;

import org.ecommerce.backend.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> findAll() {
        // Open a session
        Session session = sessionFactory.openSession();

        // Create CriteriaBuilder
        CriteriaBuilder builder = session.getCriteriaBuilder();

        // Create CriteriaQuery
        CriteriaQuery<User> criteria = builder.createQuery(User.class);

        // Specify criteria root
        criteria.from(User.class);

        // Execute query
        List<User> users = session.createQuery(criteria).getResultList();

        // Close session
        session.close();

        return users;
    }
}
