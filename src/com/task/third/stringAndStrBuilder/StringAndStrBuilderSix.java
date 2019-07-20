package com.task.third.stringAndStrBuilder;

//Из заданной строки получить новую, повторив каждый символ дважды

public class StringAndStrBuilderSix {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "And they didn't give me pills; they gave me" +
                " clumps on the side of the head";
        char [] arr = s.toCharArray();
        for (var v : arr) {
            sb.append(v + "" + v);
        }
        System.out.println(sb);
    }
}
