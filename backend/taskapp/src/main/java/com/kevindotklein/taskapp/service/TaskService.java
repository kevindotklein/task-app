package com.kevindotklein.taskapp.service;

import com.kevindotklein.taskapp.entity.task.Task;
import com.kevindotklein.taskapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll(){
        return this.taskRepository.findAll();
    }

    public void save(Task task){
        this.taskRepository.save(task);
    }
}
