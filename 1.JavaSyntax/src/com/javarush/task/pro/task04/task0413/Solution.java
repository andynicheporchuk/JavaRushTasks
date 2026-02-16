package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {

        for (int hight = 1; hight <= 10; hight++) {
            for (int width = 0; width < hight; width++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
