package com.testspringcloud.services;

import com.testspringcloud.entity.User;
import java.util.List;

public interface UserService {
    void save(User user);
    void delete(String id);
    List<User> findAll();
    User findOne(String id);
    String throwException();
}
