package com.vianneydiris.tasks.service;

import com.vianneydiris.tasks.domain.Task;

public interface TaskService {
    Iterable<Task> list();
}
