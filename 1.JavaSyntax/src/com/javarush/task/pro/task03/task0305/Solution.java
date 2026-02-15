package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();

        if (i1 == i2 && i2 == i3) {
            System.out.println(i1 + " " + i2 + " " + i3);
        } else if (i2 == i3) {
            System.out.println(i2 + " " + i3);
        } else if (i1 == i3) {
            System.out.println(i1 + " " + i3);
        } else if (i1 == i2) {
            System.out.println(i1 + " " + i2);
        }


    }
}
