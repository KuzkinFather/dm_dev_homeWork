package com.dmdev.homework;

import java.util.Scanner;

/**
 * Задание 1
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */


public class HW1_cycle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = anEvenNumber(number);
        int result2 = oddNumber(number);

        System.out.println("In the entered number: "+ result + " even number(s)");
        System.out.println("In the entered number: "+ result2 + " odd number(s)");
    }

    public static int anEvenNumber(int value) {
        int result = 0;
        int number = 0;
        for (int i = value; i > 0; i /= 10) {
            number = i % 10;
            if (number % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int oddNumber(int value) {
        int result = 0;
        int number = 0;
        for (int i = value; i > 0; i /= 10) {
            number = i % 10;
            if (number % 2 != 0) {
                result++;
            }
        }
        return result;
    }
}

