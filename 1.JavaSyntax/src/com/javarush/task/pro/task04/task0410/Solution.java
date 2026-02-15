package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int i;
        boolean isFirst = true;

        while (sc.hasNextInt()) {
            i = sc.nextInt();
            if (i < min && isFirst) {
                secondMin = i;
                min = i;
                isFirst = false;
            }

            if (i < min) {
                secondMin = min;
                min = i;
            } else if (i < secondMin && i != min) {
                secondMin = i;
            } else if (min == secondMin) {
                secondMin = i;
            }
        }
        System.out.println(secondMin);

    }


}
