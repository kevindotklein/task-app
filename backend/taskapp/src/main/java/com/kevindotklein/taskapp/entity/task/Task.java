package com.kevindotklein.taskapp.entity.task;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private String image;

    public Task(TaskRequestDTO data){
        this.content = data.content();
        this.image = data.image();
    }
}
