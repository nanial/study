package com.task.third.regularExspression;

//Cоздать приложение, разбирающее текст (текст хранится в строке) и
// позволяющее выполнять с текстом три различных операции: отсортировать
// абзацы по количеству  предложений; в каждом предложении отсортировать
// слова по длине; отсортировать  лексемы в предложении по убыванию
// количества вхождений заданного символа, а в случае равенства – по алфавиту.

import java.util.Arrays;

public class RegularExspressionsOne {

        public static void main(String[] args) {
            String s = "I could not at first feel any pulse at all." +
                    "Then, all of a sudden, it seemed to start off." +
                    "I pulled out my watch and timed it." +
                    "  I made it a hundred and forty-seven to the minute." +
                    "I tried to feel my heart. I could not feel my heart." +
                    "It had stopped beating. I have since been induced to come " +
                    "to the opinion that it must have been there all the time," +
                    "and must have been beating, but I cannot account for it." +
                    "  I patted myself all over my front, from what I call my waist " +
                    "up to my head, and I went a bit round each side, and a little" +
                    "way up the back. But I could not feel or hear anything." +
                    "  I tried to look at my tongue. I stuck it out as far as ever it would go," +
                    "and I shut one eye, and tried to examine it with the other." +
                    "I could only see the tip, and the only thing that I could gain" +
                    "from that was to feel more certain than before that I had scarlet fever.";

            sortOfSentence(s);
            sortOfWord(s);
            sortLexemes(s);

        }
    private static void sortLexemes(String s) {

        String lex = "l";
            String[] sentences = s.split("(?:[?.!])");

            for (String sentence : sentences) {

                String[] words = sentence.split("(?:[- :;,')])");

                for (int k = words.length - 1; k >= 0; k--) {

                    for (int m = 0; m < k; m++) {

                        int lexemInWord = 0;
                        int lexemInNextWord = 0;

                        for (int n = 0; n < words[m].length(); n++) {

                            if (String.valueOf(words[m].charAt(n)).
                                    compareToIgnoreCase(lex) == 0) {
                                lexemInWord++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {

                            if (String.valueOf(words[m + 1].charAt(n))
                                    .compareToIgnoreCase(lex) == 0) {
                                lexemInNextWord++;
                            }
                        }
                        if (lexemInWord < lexemInNextWord) {
                            String temp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = temp;
                        }
                        else if (lexemInWord == lexemInNextWord) {

                            String [] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);//in alphabet order
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }
               print(words);
            }
        }
    private static void sortOfWord(String s) {
        String[] sentence = s.split("(?:[?.!])");
        String temp;
        for (var v : sentence) {
            String [] words = v.split("(?:[- :;,')])");
            for (int k = words.length - 1; k >= 0; k--) {
                for (int m = 0; m < k; m++) {
                    if (words[m].length() > words[m + 1].length()) {
                        temp = words[m];
                        words[m] = words[m + 1];
                        words[m + 1] = temp;
                    }
                }
            }
            print(words);
        }
    }
    private static void sortOfSentence(String s){

        String [] paragraphs = s.split("  ");
        int [] countSentInPar = new int[paragraphs.length];
        int maxCount = 0;

        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = paragraphs[i].split("(?:[?.!])");
            countSentInPar[i] = sentences.length;

            if(maxCount < countSentInPar[i]){
                maxCount = countSentInPar[i];
            }
        }

        for (int i = 1; i <= maxCount; i++) {
            for (int j = 0; j < countSentInPar.length; j++) {

                if (i == countSentInPar[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }
    private static void print(String [] s){
        for (var v : s) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

}