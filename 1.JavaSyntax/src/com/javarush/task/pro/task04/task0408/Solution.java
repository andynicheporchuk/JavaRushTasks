package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int i;
        int maxEven = 0;
        boolean isFirst = true;
        int min = Integer.MIN_VALUE;

        while (sc.hasNextInt()) {
            i = sc.nextInt();

            if (isFirst && i % 2 == 0) {
                maxEven = i;
                isFirst = false;
            } else if (i % 2 == 0) {
                maxEven = i > maxEven ? i : maxEven;
            }
        }

        if (isFirst) {
            System.out.println(min);
        } else {
            System.out.println(maxEven);
        }
    }
}