package com.kevindotklein.taskapp.repository;

import com.kevindotklein.taskapp.entity.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
