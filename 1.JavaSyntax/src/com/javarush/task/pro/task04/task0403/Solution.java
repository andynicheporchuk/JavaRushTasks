package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                sum = sum + num;
            } else if (sc.hasNextLine()) {
                String s = sc.nextLine();
                if (s.equals("ENTER")) {
                    System.out.println(sum);
                    break;
                }
            }
        }
    }
}