package com.finalTask.noteBook.filter;

import java.time.LocalDate;

public class Filter {

    private String theme;
    private LocalDate dateOfEdit;
    private String email;
    private String message;
    private String certainWord;


    public Filter(String theme, LocalDate dateOfEdit, String email, String message) {
        this.theme = theme;
        this.dateOfEdit = dateOfEdit;
        this.email = email;
        this.message = message;
    }

    public Filter(String certainWord) {
        this.certainWord = certainWord;
    }

    public String getCertainWord() {
        return certainWord;
    }

    public void setCertainWord(String certainWord) {
        this.certainWord = certainWord;
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
