package com.finalTask.noteBook.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Note implements Serializable {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int noteId;
    private String theme;
    private LocalDate dateOfEdit;
    private String email;
    private String message;

    public Note() {
    }

    public Note(String subject, LocalDate dateOfEdit, String email, String message) {

        this.noteId = count.incrementAndGet();
        this.theme = subject;
        this.dateOfEdit = dateOfEdit;
        this.email = email;
        this.message = message;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
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

    @Override
    public String toString() {
        return "Note{" +
                "noteId=" + noteId +
                ", theme='" + theme + '\'' +
                ", dateOfEdit=" + dateOfEdit +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
