package com.testspringcloud.service;

import com.testspringcloud.entity.Task;
import java.util.List;

public interface TaskService {
    void save(Task task);
    void delete(int id);
    List<Task> findAll();
    List<Task> findByUsernameAndStatus(String username, boolean status);
    List<Task> findByUsername(String username);
}
