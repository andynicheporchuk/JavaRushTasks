package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int speedWind = sc.nextInt();
        int speedWindKmPerHour = (int) Math.round(speedWind * 3.6);
        System.out.println(speedWindKmPerHour);
    }
}