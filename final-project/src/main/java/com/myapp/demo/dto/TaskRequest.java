package com.myapp.demo.dto;



import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record TaskRequest(
        @NotBlank(message = "Назва завдання не може бути порожньою")
        String title,

        String note,

        @NotNull(message = "Дедлайн є обов'язковим")
        @Schema(type = "string", example = "2026-05-25T18:00:00")
        LocalDateTime dueDate
) {}