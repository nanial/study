package com.task.fifth.oop_text_file;

public class File {

    private String nameOfFile;
    private Directory dir;


    public File(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public File(String nameOfFile, Directory dir) {
        this.nameOfFile = nameOfFile;
        this.dir = dir;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public void renameFile(String newNameOfFile){
        this.setNameOfFile(newNameOfFile);
    }

    @Override
    public String toString() {
        return nameOfFile;
    }
}
