package com.task.fourth.agrigationText;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private String title;
    private List<Sentence> snippet;

    public Text(String title) {
        this.title = title;
        this.snippet = new ArrayList<>();
    }

    public void addSentence(Sentence sent) {
       snippet.add(sent);
    }

    public void printTitle() {
        System.out.println(title);
    }

    public void printWholeText(){

        System.out.println(title);

        for (Sentence v : snippet) {
            v.printSentence();
        }
    }
}

