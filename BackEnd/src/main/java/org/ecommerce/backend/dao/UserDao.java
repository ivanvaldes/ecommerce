package org.ecommerce.backend.dao;

import org.ecommerce.backend.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
