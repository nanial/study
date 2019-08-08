package com.task.fifth.oopTextFile;

import java.util.ArrayList;

public class Directory {
    private String pathName;
    private ArrayList<File> files;

    public Directory(String pathName, ArrayList<File> files) {
        this.pathName = pathName;
        this.files = files;
    }

    public TextFile createNewFile(String nameOfFile){

        return new TextFile(nameOfFile, this);
    }

    public void addNewFile(File file){

        if(files.contains(file)){
            System.out.println("Impossible addition file of same name in this directory!");
        }else {
            files.add(file);
        }
    }
    public void deleteFile(File file){

        if(files.contains(file)){

            files.remove(file);
            
        }else {
            System.out.println("This file doesn't exist!");
        }
    }

    @Override
    public String toString() {
        return "Directory{" +
                "pathName='" + pathName + '\'' +
                ", files=" + files +
                '}';
    }
}
