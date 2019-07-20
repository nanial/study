package com.task.third.stringAndStrBuilder;

//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем


public class StringAndStrBuilderOne {
    public static void main(String[] args) {
        String s = " And   don't      stuff up   your head" +
                " with  things  you don't  understand ";
        System.out.println(maxCountOfSpace(s));

    }
    private static int maxCountOfSpace(String s) {
        int count = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 32){
                count++;

                if(count > max){
                    max = count;
                }

            } else {
                count = 0;
            }
        }
        return max;
    }
}
