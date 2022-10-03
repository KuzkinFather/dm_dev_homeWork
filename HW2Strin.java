package com.dmdev.lesson10.HomeWork;

import java.util.Arrays;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class HW2Strin {

    public static void main(String[] args) {

        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] result = numberArray(value);
        System.out.println(Arrays.toString(result));
        System.out.println(sumArray(result));
    }


    public static int[] numberArray(String value) {
        String result = value.replace(" ", "").toUpperCase();

        char[] charValue = result.toCharArray();
        String newString = "";
        for (int i = 0; i < charValue.length - 1; i++) {
            if (charValue[i] >= '1' && charValue[i] <= '9') {
                newString += charValue[i];
            }
        }

        char[] xValueChar = newString.toCharArray();
        int[] resultArray = new int[newString.length()];
        for (int i = 0; i < newString.length(); i++) {
            resultArray[i] = Integer.parseInt(String.valueOf(xValueChar[i]));
        }
        return resultArray;
    }

    public static int sumArray(int[] value) {
        int result = 0;
        for (int i = 0; i < value.length; i++) {
            result += value[i];
        }
        return result;
    }


}
