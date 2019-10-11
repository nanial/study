package com.task.sixth.noteBook.business;

import com.task.sixth.noteBook.apiBusiness.NotebookBuilder;

public class NotebookBuilderFactory {

    public static NotebookBuilder getNotebookBuilder() {
        return NotebookBulderImpl.getInstance();
    }
}
