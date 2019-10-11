package com.task.fifth.oop_text_file;

public class Text {

    private String title;
    private StringBuffer content;

    public Text(String title, StringBuffer content) {
        this.title = title;
        this.content = content;
    }

    public StringBuffer getContent() {
        return content;
    }

    public void setContent(StringBuffer content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return title + "\n" + content;
    }

    public void supplyText(String suppSnipet){
        this.setContent(this.getContent().append(suppSnipet));
    }
}
