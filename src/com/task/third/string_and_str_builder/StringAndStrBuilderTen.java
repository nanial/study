package com.task.third.string_and_str_builder;

//Строка X состоит из нескольких предложений, каждое из
//которых кончается точкой, восклицательным или вопросительным
// знаком. Определить количество предложений в строке X.

public class StringAndStrBuilderTen {

    public static void main(String[] args) {

        String s = "I should be to a class!" +
                " I was a hospital in myself." +
                " Why hadn't I got housemaid's knee? " +
                " Why this invidious reservation? " +
                "After a while, however, " +
                "less grasping feelings prevailed.";

        int countSentence = 0;

        for (var v : s.toCharArray()) {

            if(v == 46 || v == 63 || v == 33){
                countSentence++;
            }
        }
        System.out.println(countSentence);
    }
}
