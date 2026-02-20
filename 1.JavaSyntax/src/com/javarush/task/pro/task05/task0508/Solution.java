package com.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < 6; i++) {
            strings[i] = sc.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            boolean wasNull = false;

            for (int j = i + 1; j < strings.length; j++) {

                if (strings[i] != null && strings[i].equals(strings[j])) {
                    strings[j] = null;
                    wasNull = true;
                }
            }
            if (wasNull) {
                strings[i] = null;
            }
        }

        Arrays.toString(strings);

        //напишите тут ваш код
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
