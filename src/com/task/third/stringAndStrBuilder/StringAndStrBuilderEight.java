package com.task.third.stringAndStrBuilder;

//Вводится строка слов, разделенных пробелами. Найти самое длинное
// слово и вывести его на экран. Случай, когда самых длинных слов
// может быть несколько, не обрабатывать

public class StringAndStrBuilderEight {

    public static void main(String[] args) {

        String s = "And they didn't give me pills; they gave me" +
                " clumps on the side of the head";

        String[] word= s.split(" ");
        String maxWord=" ";

        for(var i :  word){

            if(i.length() >= maxWord.length()){
                maxWord= i;
            }
        }
        System.out.println(maxWord);
    }
}
