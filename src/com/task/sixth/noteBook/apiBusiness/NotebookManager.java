package com.task.sixth.noteBook.apiBusiness;

import com.task.sixth.noteBook.domain.Note;
import com.task.sixth.noteBook.filter.Filter;

import java.util.ArrayList;
import java.util.Set;

public interface NotebookManager {

    ArrayList<Note> getListNote(Filter filter);
    void writeInFileNote(ArrayList<Note> notes);
    Set<Note> sortDate();
}
