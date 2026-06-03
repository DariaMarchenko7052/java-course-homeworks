package com.myapp.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TaskControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnBadRequestWhenTitleIsEmpty() throws Exception {
        // Given: Тіло запиту з порожнім title (Test Case 2)
        String invalidTaskJson = """
        {
            "title": "",
            "note": "Тестова нотатка",
            "dueDate": "2026-05-25T18:00:00"
        }
        """;

        // When & Then: Відправляємо запит і очікуємо статус 400 Bad Request
        mockMvc.perform(post("/api/v1/sections/112/tasks")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(invalidTaskJson))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.errors.title").value("Назва завдання не може бути порожньою"));
    }

    @Test
    public void shouldCreateTaskSuccessfully() throws Exception {
        // Given: Валідне тіло запиту (Test Case 1)
        String validTaskJson = """
        {
            "title": "Відправити звіт",
            "note": "Використати дані з останньої лабораторної",
            "dueDate": "2026-05-25T18:00:00"
        }
        """;

        // When & Then: Відправляємо запит і очікуємо статус 201 Created та наявність ID
        mockMvc.perform(post("/api/v1/sections/112/tasks")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(validTaskJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").exists())
                .andExpect(jsonPath("$.title").value("Відправити звіт"))
                .andExpect(jsonPath("$.status").value("TODO"));
    }
}