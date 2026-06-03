package com.myapp.demo.model;



import java.time.LocalDateTime;

public class Task {
    private String id;
    private String sectionId;
    private String title;
    private String note;
    private String status;
    private LocalDateTime dueDate;
    private LocalDateTime createdAt;

    // Конструктор
    public Task(String id, String sectionId, String title, String note, String status, LocalDateTime dueDate, LocalDateTime createdAt) {
        this.id = id;
        this.sectionId = sectionId;
        this.title = title;
        this.note = note;
        this.status = status;
        this.dueDate = dueDate;
        this.createdAt = createdAt;
    }

    // Геттери (потрібні, щоб Spring міг прочитати дані)
    public String getId() { return id; }
    public String getSectionId() { return sectionId; }
    public String getTitle() { return title; }
    public String getNote() { return note; }
    public String getStatus() { return status; }
    public LocalDateTime getDueDate() { return dueDate; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
