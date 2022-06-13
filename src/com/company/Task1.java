package com.company;

import java.util.ArrayList;

/**
 * // ЗАДАЧА:
 * // 1. Создать и заполнить список строк случайными данными
 * // 2. Вывести строки в формате:
 * // "<строка 1>"
 * // "<строка 2>" и т.д.
 * // 3. Отсортировать строки по длине
 * // 4. Снова вывести
 * // 5. Найти строку, у которой length == 3 (первое вхождение) и вывести ее
 * // УСЛОВИЕ - нельзя использовать циклы для выполнения пунктов 2 - 5 ->
 * // будем использовать функциональные интерфейсы и lambda
 */


public class Task1 {

    public static void main(String[] args) {
        // 1. Создаем лист
        ArrayList<String> listStr = new ArrayList<>();

        //Заполним лист
        listStr.add("ABBA");
        listStr.add("Hello!!!!");
        listStr.add("World");
        listStr.add("Bye-bye");

        // 2. Вывод данных с помощью Lambda
        listStr.forEach((str) -> System.out.println("\"" + str + "\""));
        System.out.println();

        // 3. Отсортировать строки по длине
        listStr.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // 4. Вывод данных с помощью Lambda
        System.out.println("Отсортированные строки по длине: ");
        listStr.forEach((str) -> System.out.println("\"" + str + "\""));

        // 5. Найти строку, у которой length == 4 (первое вхождение) и вывести
        System.out.println("Строка у которой length == 4: ");
        String item = listStr.stream().filter((str) -> str.length() == 4).findFirst().get();
        System.out.println(item);
    }
}
