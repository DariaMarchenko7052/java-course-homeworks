package com.myapp.demo.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;

public record TaskResponse(
        String id,
        String sectionId,
        String title,
        String note,
        String status,

        @Schema(type = "string", example = "2026-06-03T12:00:00")
        LocalDateTime createdAt
) {}