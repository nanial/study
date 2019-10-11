package com.task.fifth.oop_text_file;


public class TextFile extends File {

    private Text text;

    public TextFile(String nameOfFile, Directory dir) {
        super(nameOfFile, dir);
    }
    public void setText(Text text) {
        this.text = text;
    }

    public Text getText() {
        return text;
    }

    public void printText(){
        System.out.println(this.getText().toString());
    }

    @Override
    public String toString() {
        return getNameOfFile();
    }
}
