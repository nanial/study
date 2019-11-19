package com.task.fifth.text_file.logic;

import com.task.fifth.text_file.bean.File;
import com.task.fifth.text_file.bean.TextFile;

public interface DirectoryUtils {

    TextFile createNewFile(String nameOfFile);
    void addNewFile(File file);
    void deleteFile(File file);
}
