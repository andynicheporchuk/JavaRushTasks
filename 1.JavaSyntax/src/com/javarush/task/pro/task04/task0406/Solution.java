package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit) {
            String s = sc.nextLine();
            if (s.equals("enough")) {
                break;
            } else {
                System.out.println(s);
            }
        }
    }
}