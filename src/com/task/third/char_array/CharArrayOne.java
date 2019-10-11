package com.task.third.char_array;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case

public class CharArrayOne {

        public static void main(String[] args) {
            int counter;

            String[] stringArr = new String[]{"literaryStyle", "fleshAndBlood", "twelveStone",
                    "otherWorks", "humanNature", "mayRival"};

            for (var i : stringArr) {
                counter = 0;
                char[] charArr = i.toCharArray();

                for (int j : charArr) {
                    if (j >= 65 && j <= 90) {//make space for "_"
                        counter++;          //upper register
                    }
                }
                char[] temp = new char[charArr.length + counter];

                counter = 0;

                for (int j : charArr) {

                    if (j >= 65 && j <= 90) {
                        temp[counter++] = 95;   //"_"
                        temp[counter++] = (char) (j + 32);// low register
                    }
                    else {
                        temp[counter++] = (char) j;
                    }
                }
                System.out.println(temp);
            }
        }
}