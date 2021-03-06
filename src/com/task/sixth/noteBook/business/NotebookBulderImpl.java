package com.task.sixth.noteBook.business;

import com.task.sixth.noteBook.domain.Notebook;
import com.task.sixth.noteBook.apiBusiness.NotebookBuilder;

public class NotebookBulderImpl implements NotebookBuilder {

    private Notebook notebook;
    private static NotebookBulderImpl instance;

    public NotebookBulderImpl() {
        this.notebook = new Notebook();
    }

    synchronized public static  NotebookBulderImpl getInstance() {

        if (instance == null){

            instance = new NotebookBulderImpl();
        }
        return instance;
    }
    @Override
    public Notebook getNotebook() {
        return notebook;
    }
}
