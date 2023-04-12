package com.kevindotklein.taskapp.controller;

import com.kevindotklein.taskapp.entity.task.Task;
import com.kevindotklein.taskapp.entity.task.TaskRequestDTO;
import com.kevindotklein.taskapp.entity.task.TaskResponseDTO;
import com.kevindotklein.taskapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<TaskResponseDTO> getAll(){
        List<TaskResponseDTO> taskList = this.taskService.findAll().stream().map(TaskResponseDTO::new).toList();
        return taskList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveTask(@RequestBody TaskRequestDTO data){
        Task taskData = new Task(data);
        this.taskService.save(taskData);
        return;
    }
}
