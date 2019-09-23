package com.finalTask.noteBook.apiDao;

import com.finalTask.noteBook.Note;

import java.util.ArrayList;

public interface NotebookDao {

    ArrayList<Note> getListNote();
    void writeInFileNote(Note note);
}
