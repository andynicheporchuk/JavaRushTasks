package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] array= new int[n];

        if (n > 0) {
            int n1;
            for (int i = 0; i < n; i++) {
                n1 = sc.nextInt();
                array[i] = n1;
            }
        }

        if (n % 2 == 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            for (int element : array) {
                System.out.println(element);
            }
        }
    }
}
