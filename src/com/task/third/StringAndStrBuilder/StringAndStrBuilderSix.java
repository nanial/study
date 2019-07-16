package com.task.third.StringAndStrBuilder;

//Из заданной строки получить новую, повторив каждый символ дважды

public class StringAndStrBuilderSix {

    public static void main(String[] args) {

        String s = "And they didn't give me pills; they gave me" +
                " clumps on the side of the head";
        char [] arr = s.toCharArray();
        for (var v : arr) {
            System.out.print(v + "" + v);
        }
    }
}
