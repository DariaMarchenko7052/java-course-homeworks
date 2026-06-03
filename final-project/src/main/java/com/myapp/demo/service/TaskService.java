package com.myapp.demo.service;



import com.myapp.demo.dto.TaskRequest;
import com.myapp.demo.dto.TaskResponse;
import com.myapp.demo.model.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TaskService {

    // Сховище в пам'яті: Map<ID завдання, Об'єкт завдання>
    private final Map<String, Task> taskStorage = new ConcurrentHashMap<>();

    public TaskResponse createTask(String sectionId, TaskRequest request) {
        // Генеруємо читабельний ID, як у контракті: task-uuid-XXXX
        String taskId = "task-uuid-" + UUID.randomUUID().toString().substring(0, 4);

        // Створюємо внутрішню модель
        Task newTask = new Task(
                taskId,
                sectionId,
                request.title(),
                request.note(),
                "TODO",
                request.dueDate(),
                LocalDateTime.now(ZoneOffset.UTC)
        );

        // Зберігаємо в нашу Map
        taskStorage.put(taskId, newTask);

        // Повертаємо TaskResponse DTO
        return new TaskResponse(
                newTask.getId(),
                newTask.getSectionId(),
                newTask.getTitle(),
                newTask.getNote(),
                newTask.getStatus(),
                newTask.getCreatedAt()
        );
    }
}
