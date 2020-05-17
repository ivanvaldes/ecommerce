package org.ecommerce.backend.service;

import org.ecommerce.backend.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
