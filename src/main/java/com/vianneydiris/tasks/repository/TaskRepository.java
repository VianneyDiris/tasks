package com.vianneydiris.tasks.repository;

import com.vianneydiris.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Long> {
}
