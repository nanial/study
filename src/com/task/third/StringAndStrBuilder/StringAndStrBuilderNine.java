package com.task.third.StringAndStrBuilder;

//Посчитать количество строчных (маленьких)
// и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

public class StringAndStrBuilderNine {

    public static void main(String[] args) {

        String s = "And they didn't give me pills; they gave me" +
                " clumps on the side of the head";

        int counterLow = 0;
        int counterUp = 0;

        for (var v : s.toCharArray()) {
            if(v >= 97 && v <= 122){
                counterLow++;
            }
            if(v >= 65 && v <= 90){
                counterUp++;
            }
        }
        System.out.println(counterLow);
        System.out.println(counterUp);
    }
}
