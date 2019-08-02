package com.task.fourth.agrigationText;

//Создать объект класса Текст, используя классы Предложение, Слово.
//Методы: дополнить текст, вывести на консоль текст, заголовок текста

public class Main {
    public static void main(String[] args) {

        Sentence sentence1 = new Sentence();
        sentence1.addWords(new Word("The flesh"));
        sentence1.addWords(new Word("covers"));
        sentence1.addWords(new Word("the bone"));
        Sentence sentence2 = new Sentence();
        sentence2.addWords(new Word("\n and"));
        sentence2.addWords(new Word("they"));
        sentence2.addWords(new Word("put"));
        sentence2.addWords(new Word("a mind"));

        Sentence sentence3 = new Sentence();
        sentence3.addWords(new Word("\n in"));
        sentence3.addWords(new Word("there"));
        sentence3.addWords(new Word("and"));
        sentence3.addWords(new Word("sometimes"));
        sentence3.addWords(new Word("a soul"));


        Text text = new Text("    Alone With Everybody");
        text.addSentence(sentence1);
        text.addSentence(sentence2);
        text.addSentence(sentence3);

        text.printWholeText();
        System.out.println();
        text.printTitle();
    }
}
