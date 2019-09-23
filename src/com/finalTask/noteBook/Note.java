package com.finalTask.noteBook;

import java.time.LocalDate;

public class Note {
    private String theme;
    private LocalDate dateOfEdit;
    private String email;
    private String message;

    public Note() {
    }

    public Note(String subject, LocalDate dateOfEdit, String email, String message) {
        this.theme = subject;
        this.dateOfEdit = dateOfEdit;
        this.email = email;
        this.message = message;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public LocalDate getDateOfEdit() {
        return dateOfEdit;
    }

    public void setDateOfEdit(LocalDate dateOfEdit) {
        this.dateOfEdit = dateOfEdit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
