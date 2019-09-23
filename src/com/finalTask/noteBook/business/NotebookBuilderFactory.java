package com.finalTask.noteBook.business;

import com.finalTask.noteBook.apiBusiness.NotebookBuilder;

public class NotebookBuilderFactory {

    public static NotebookBuilder getNotebookBuilder() {
        return NotebookBulderImpl.getInstance();
    }
}
