package com.finalTask.noteBook.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Notebook implements Serializable {

    private ArrayList<Note> listOfNotes = new ArrayList<>();

    public ArrayList<Note> getListOfNotes() {
        return this.addNoteInList();
    }

    public void setListOfNotes(ArrayList<Note> listOfNotes) {
        this.listOfNotes = listOfNotes;
    }

    public ArrayList<Note> addNoteInList(){

        listOfNotes.add(new Note("Shopping list", LocalDate.parse("2019-10-12"),
                "notes01@mail.ru", "don't forget to buy.."));

        listOfNotes.add(new Note("Invite sheet", LocalDate.parse("2019-08-14"),
                "guest01@mail.ru", "Welcome to the party!"));

        listOfNotes.add(new Note("Repair for plan", LocalDate.parse("2019-03-13"),
                "fixes01@mail.ru", "Sequence of work"));

        listOfNotes.add(new Note("Recommended movies", LocalDate.parse("2019-12-31"),
                "movies19@mail.ru", "Will be complete at last moment of year"));

        return listOfNotes;
    }
}
