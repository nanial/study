package com.task.third.stringAndStrBuilder;

//Проверить, является ли заданное слово палиндромом


public class StringAndStrBuilderThree {

    public static void main(String[] args) {

        String s = "lolalol";
        StringBuffer rev = new StringBuffer(s).reverse();

        String strRev = rev.toString();

        if(s.equals(strRev)){
            System.out.println("This word is palindrome");
        }
        else { System.out.println("This word isn't palindrome");}
    }
}
