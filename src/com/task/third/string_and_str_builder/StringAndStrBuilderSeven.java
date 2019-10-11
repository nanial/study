package com.task.third.string_and_str_builder;

//Вводится строка. Требуется удалить из нее повторяющиеся символы
// и все пробелы. Например, если было введено "abc cde def",
// то должно быть выведено "abcdef"

public class StringAndStrBuilderSeven {

    public static void main(String[] args) {

        String s = "And they didn't give me pills; they gave me" +
                " clumps on the side of the head";
        StringBuilder sb = new StringBuilder();

        s.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println("'" + sb.toString().replaceAll("\\s+", "") + "'");

    }

}
