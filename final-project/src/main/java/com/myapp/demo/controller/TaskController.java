package com.myapp.demo.controller;



import com.myapp.demo.dto.TaskRequest;
import com.myapp.demo.dto.TaskResponse;
import com.myapp.demo.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sections")
public class TaskController {

    private final TaskService taskService;

    // Constructor Injection (Вимога чеклиста: БЕЗ @Autowired на полі)
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/{sectionId}/tasks")
    @ResponseStatus(HttpStatus.CREATED)
    public TaskResponse createTask(
            @PathVariable String sectionId,
            @Valid @RequestBody TaskRequest request) {

        return taskService.createTask(sectionId, request);
    }
}
