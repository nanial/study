package com.task.third.stringAndStrBuilder;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”


public class StringAndStrBuilderFive {

    public static void main(String[] args) {
        String s = "You know, it often is so " +
                "those simple, old-fashioned remedies are sometimes" +
                " more efficacious than all the dispensary stuff";

        System.out.println(countOfA(s));

    }
    private static int countOfA(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 97) {
                count++;
            }
        }
        return count;
    }
}
