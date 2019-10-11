package com.task.sixth.noteBook.business;

import com.task.sixth.noteBook.apiBusiness.NotebookManager;
import com.task.sixth.noteBook.apiDao.NotebookDao;
import com.task.sixth.noteBook.domain.Note;
import com.task.sixth.noteBook.filter.Filter;

import java.util.ArrayList;
import java.util.Set;

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

    @Override
    public Set<Note> sortDate(){
        return dao.sortDate();
    }
}
