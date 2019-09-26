package com.finalTask.noteBook.apiBusiness;

import com.finalTask.noteBook.domain.Note;
import com.finalTask.noteBook.filter.Filter;

import java.util.ArrayList;
import java.util.Set;

public interface NotebookManager {

    ArrayList<Note> getListNote(Filter filter);
    void writeInFileNote(ArrayList<Note> notes);
    Set<Note> sortDate();
}
