package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        System.out.println((i + i1 + i2) / 3);
    }
}
