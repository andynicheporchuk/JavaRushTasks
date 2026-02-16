package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        int i = 0;

        do {
            if (num <= 0 || num >=5) {
                System.out.println(str);
                break;
            }
            System.out.println(str);
            i++;
        } while (i <= num - 1);
    }
}
