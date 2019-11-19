package com.task.fifth.text_file.logic;

import com.task.fifth.text_file.bean.Directory;
import com.task.fifth.text_file.bean.File;
import com.task.fifth.text_file.bean.TextFile;

public class DirectoryUtilsImpl implements DirectoryUtils{

    private Directory dir;

    public DirectoryUtilsImpl(Directory dir) {
        this.dir = dir;
    }

    public TextFile createNewFile(String nameOfFile){

        return new TextFile(nameOfFile, dir);
    }

    public void addNewFile(File file){

        if(dir.getFiles().contains(file)){
            System.out.println("Impossible addition file of same name in this directory!");
        }else {
            dir.getFiles().add(file);
        }
    }
    public void deleteFile(File file){

        if(dir.getFiles().contains(file)){

            dir.getFiles().remove(file);

        }else {
            System.out.println("This file doesn't exist!");
        }
    }

    @Override
    public String toString() {
        return "DirectoryUtils{" +
                "dir=" + dir +
                '}';
    }
}
