package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;

/* 
Дефрагментация памяти
*/

public class Solution {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        int indexNull = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null && indexNull == -1) {
                indexNull = i;
            }

            if (indexNull != -1 && array[i] != null) {
                array[indexNull] = array[i];
                array[i] = null;
                indexNull++;
            }

        }

        // ["a", null, null, "b", "c"]
    }
}
