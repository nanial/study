package com.task.third.char_array;

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
            int counter = 0;
            Pattern patt = Pattern.compile("\\d");
            Matcher match = patt.matcher(s);

            while(match.find()){
                counter++;
            }
            return counter;
        }
}