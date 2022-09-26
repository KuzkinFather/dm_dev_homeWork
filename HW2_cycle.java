package com.dmdev.homework;

/**
 * Задание 2
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 */


public class HW2_cycle {

    public static void main(String[] args) {
        int value = 4508;
        int result = recurtionValue(value);

        System.out.println(result);
    }

    public static int recurtionValue(int value) {
        int reversed = 0;
        for (int i = value; i > 0; i /= 10) {
            int remains = i % 10;
            reversed = reversed * 10 + remains;
        }
        return reversed;
    }


}
