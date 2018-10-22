package com.testspringcloud.repository;

import com.testspringcloud.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends MongoRepository<Task, Integer> {
    List<Task> findTaskByUsername(String username);
    List<Task> findTaskByUsernameAndStatus(String username, boolean status);
}
