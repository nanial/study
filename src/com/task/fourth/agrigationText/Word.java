package com.task.fourth.agrigationText;

public class Word {
    private String uniqueWord;

    public Word(String uniqueWord) {
        this.uniqueWord = uniqueWord;
    }

    @Override
    public String toString() {
        return " " + uniqueWord;
    }
}
