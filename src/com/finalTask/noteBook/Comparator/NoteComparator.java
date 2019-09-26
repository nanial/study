package com.finalTask.noteBook.Comparator;

import com.finalTask.noteBook.domain.Note;

import java.util.Comparator;

public class NoteComparator implements Comparator<Note> {

    @Override
    public int compare(Note o1, Note o2) {
        return o1.getDateOfEdit().compareTo(o2.getDateOfEdit());
    }
}
