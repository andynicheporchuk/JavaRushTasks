package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        boolean whoAmI = sc.nextBoolean();

        if (whoAmI) {
            int ceil = (int) Math.ceil(glass);
            System.out.println(ceil);
        } else {
            int floor = (int) Math.floor(glass);
            System.out.println(floor);
        }

    }
}