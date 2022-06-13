package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Task2 {
    /**
     * // ЗАДАЧА: дан список чисел Integer
     * // вывести список чисел в формате <число 1> -> <число 2> -> ...
     * // отсортировать список по кол-ву нулей в числе
     * // вывести результат
     * // циклы использовать нельзя
     */

    public static void main(String[] args) {

        // 1. Создаем список чисел Integer
        ArrayList<Integer> listNumber = new ArrayList<>();

        // 2.Заполним список числами
        listNumber.add(10500);
        listNumber.add(500);
        listNumber.add(610);
        listNumber.add(70000);

        // 3.Вывод данных с помощью Lambda
        System.out.println("Список чисел: ");
        listNumber.forEach((integer) -> System.out.print(integer + "->"));

        listNumber.sort(Comparator.comparingInt(obj_ -> String.valueOf(obj_).replaceAll("[1-9]",
                "").length()));


        System.out.println();// пробел
        System.out.println();// пробел
        // 3.Вывод отсортированного списка с помощью Lambda
        System.out.println("Список чисел отсортированный : ");

        listNumber.forEach((integer) -> System.out.print(integer + "->"));

    }//main
}//class close