package com.finalTask.noteBook.business;

import com.finalTask.noteBook.apiBusiness.NotebookManager;
import com.finalTask.noteBook.apiDao.NotebookDao;
import com.finalTask.noteBook.domain.Note;
import com.finalTask.noteBook.filter.Filter;

import java.util.ArrayList;

public class NotebookManagerImpl implements NotebookManager {

    private NotebookDao dao;

    public NotebookManagerImpl(NotebookDao dao) {
            this.dao = dao;
    }

    @Override
    public ArrayList<Note> getListNote(Filter filter) {
        return dao.getListNote(filter);
    }

    @Override
    public void writeInFileNote(ArrayList<Note> notes) {
        dao.writeInFileNote(notes);
    }
}
