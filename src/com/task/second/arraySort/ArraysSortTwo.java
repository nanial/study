package com.task.second.arraySort;

//Даны две последовательности a1<=a2<=a3....<=a(n-1)<=an и b1<=b2<=b3...<=b(m-1)<=bm.
//Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
//Примечание. Дополнительный массив не использовать

import java.util.Arrays;

public class ArraysSortTwo {

        public static void main(String[] args) {

            System.out.println(Arrays.toString(merge(new int[]{-101, -11, 15, 86, 95, 220, 360},
                        new int[]{-220,-115, -115, -99, -15, 166, 174, 182, 232, 820})));
        }
        private static int[] merge(int[] a, int[] b) {

                int[] resArr = new int[a.length + b.length];
                int i = 0;
                int j = 0;
                int k = 0;

                while (i < a.length && j < b.length) {
                    if (a[i] < b[j]) {
                        resArr[k] = a[i];
                        i++;
                    } else {
                        resArr[k] = b[j];
                        j++;
                    }
                    k++;
                }

                while (i < a.length) {
                    resArr[k] = a[i];
                    i++;
                    k++;
                }

                while (j < b.length){
                    resArr[k] = b[j];
                    j++;
                    k++;
                }
                return resArr;
            }
        }
