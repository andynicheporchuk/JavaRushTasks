package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        //напишите тут ваш код
        String messageWeather = String.format("В городе %s сегодня температура воздуха %d",
                city.getName(), city.getTemperature());
        System.out.println(messageWeather);
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        City city = new City("Москва", 15);
        showWeather(city);
    }
}
