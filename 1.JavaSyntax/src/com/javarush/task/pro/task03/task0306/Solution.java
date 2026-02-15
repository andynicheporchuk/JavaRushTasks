package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();

        if ((i1 < i2 + i3) && (i2 < i1 + i3) && (i3 < i2 + i1)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
