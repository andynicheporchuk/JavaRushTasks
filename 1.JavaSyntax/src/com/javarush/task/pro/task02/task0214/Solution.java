package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toLowerCase();
        String s2 = scanner.nextLine().toUpperCase();
        String s3 = scanner.nextLine();
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s1);
    }
}
