package com.javarush.task.pro.task05.task0506;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int min = Integer.MAX_VALUE;

        int i1;

        for (int j = 0; j < n; j++) {
            array[j] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

//        System.out.println(Arrays.toString(array));
        System.out.println(min);
    }
}
