package com.task.third.string_and_str_builder;

//В строке вставить после каждого символа 'a' символ 'b'

public class StringAndStrBuilderTwo {
    public static void main(String[] args) {
        String s = "Medical science " +
                "was in a far less advanced state than now";
        System.out.println(s.replace("a", "ab"));
    }
}
