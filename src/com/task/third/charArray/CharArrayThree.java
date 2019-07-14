package com.task.third.charArray;

//В строке найти количество цифр

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharArrayThree {

        public static void main(String[] args) {

            String s = "1 pt. bitter beer every 6 hours. " +
                    "1 ten-mile walk every morning. " +
                    "1 bed at 11 sharp every night.";

            System.out.println(countOfNumber(s));

        }

        private  static int countOfNumber(String s){
            Pattern patt = Pattern.compile("\\d");
            Matcher match;
            int counter = 0;

            for(int i = 0; i < s.length(); i++){

                match = patt.matcher(String.valueOf(s.charAt(i)));//receive value of symbol
                                                                 //charAt refer at index
                if(match.matches()) {
                    counter++;
                }
            }
            return counter;
        }
}