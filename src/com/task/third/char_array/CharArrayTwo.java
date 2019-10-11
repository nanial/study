package com.task.third.char_array;

//Замените в строке все вхождения 'word' на 'letter'

public class CharArrayTwo {

        public static void main(String[] args) {

            String s = "He attempted to say a few things, but none of the " +
                    "noises actually turned into words let alone sentences.";

            System.out.println(s.replace("word", "letter"));

        }
}