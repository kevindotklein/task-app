package com.kevindotklein.taskapp.entity.task;

public record TaskResponseDTO(Long id, String content, String image) {
    public TaskResponseDTO(Task task){
        this(task.getId(), task.getContent(), task.getImage());
    }
}
