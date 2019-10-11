package com.task.third.char_array;

//Удалить в строке все лишние пробелы, то есть серии
//подряд идущих пробелов заменить на одиночные
//пробелы. Крайние пробелы в строке удалить.

public class CharArrayFive {

        public static void main(String[] args) {

            String s = " And   don't stuff up   your head" +
                    " with  things  you don't understand ";

            System.out.println("'" + s.replaceAll("\\s+", " ") + "'");
            System.out.println("'" + (s.replaceAll("\\s+", " ").trim()) + "'");
        }
}