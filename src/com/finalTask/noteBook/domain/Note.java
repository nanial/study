package com.finalTask.noteBook.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Note implements Serializable {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int noteId;
    private String theme;
    private LocalDate dateOfEdit;
    private String email;
    private String message;

    public Note() {
    }

    public Note(String theme, String dateOfEdit, String email, String message) {

        this.noteId = count.incrementAndGet();
        this.theme = theme;
        this.dateOfEdit = LocalDate.parse(this.validateDate(dateOfEdit));
        this.email = this.validateEmail(email);
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

    public String validateEmail(String toValidate){

        String validEmail = "null";
        Pattern patt = Pattern.compile("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*" +
                "@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$");
        Matcher match = patt.matcher(toValidate);

        if(!match.matches()){
            System.out.println("Email not valid");
        }
        else {
            validEmail = toValidate;
        }
        return validEmail;
    }
    public String validateDate(String toValidate){

        String validDate = "2000-01-01";
        Pattern patt = Pattern.compile("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"
                + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");

        Matcher match = patt.matcher(toValidate);

        if(!match.matches()){
            System.out.println("Date not valid");
        }
        else {
            validDate = toValidate;
        }
        return validDate;
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
