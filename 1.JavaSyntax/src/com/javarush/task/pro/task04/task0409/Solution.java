package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int i;
        int min = 0;
        int max = Integer.MAX_VALUE;
        boolean isFirstLoop = true;

        while (sc.hasNextInt()) {
            i = sc.nextInt();

            if (isFirstLoop) {
                min = i;
                isFirstLoop = false;
            } else {
                min = i < min ? i : min;
            }
        }

        if (isFirstLoop) {
            System.out.println(max);
        } else {
            System.out.println(min);
        }

    }
}