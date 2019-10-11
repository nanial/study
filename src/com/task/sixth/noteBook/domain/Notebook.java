package com.task.sixth.noteBook.domain;

import java.util.ArrayList;

public class Notebook {

    private ArrayList<Note> listOfNotes = new ArrayList<>();

    public ArrayList<Note> getListOfNotes() {
        return this.listOfNotes;
    }

    public void setListOfNotes(ArrayList<Note> listOfNotes) {
        this.listOfNotes = listOfNotes;
    }

    public ArrayList<Note> addNewNote(Note note){

        listOfNotes.add(note);
        return listOfNotes;
    }
    public ArrayList<Note> fillNoteList(){

        listOfNotes.add(new Note("Shopping list", "2019-10-12",
                "notes01@mail.ru", "don't forget to buy.."));

        listOfNotes.add(new Note("Invite sheet", "2019-08-14",
                "guest01@mail.ru", "Welcome to the party!"));

        listOfNotes.add(new Note("Repair for plan", "2019-03-13",
                "fixes01@mail.ru", "Sequence of work"));

        listOfNotes.add(new Note("Work plan", "2019-03-13",
                "job01@mail.ru", "List of employees"));

        listOfNotes.add(new Note("Recommended movies", "2019-12-31",
                "movies19@mail.ru", "Will be complete at last moment of year"));

        return listOfNotes;
    }
}
