package com.dmdev.lesson7.homework;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы
 * (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции.
 * main - только для тестирования написанного функционала.
 */

public class HomeWorkArray1 {


    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};

        int[] result = creatingCorrectArray(values);
        System.out.println(Arrays.toString(result));
    }

// I create a function that removes negative elements from the array,
// and then multiplies the elements of the array by its length.
    public static int[] creatingCorrectArray(int[] values) {
//  Creating an array of length, which is equal to the number of positive numbers of the existing array
        int[] resultArray = new int[determiningPositive(values)];
//  I create a loop that passes (iterates) through each element of the array and checks it for compliance
        for (int i = 0, indexResult = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                resultArray[indexResult++] = values[i];
            }
        }
//  I create a loop that passes (iterates) over each element of the array and multiplies it by the length of the array
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = resultArray[i] * resultArray.length;
        }
        return resultArray;
    }

//    Creating a function to determine the number of positive numbers in the existing array
    public static int determiningPositive(int[] values) {
        int counterPositiveElements = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                counterPositiveElements++;
            }
        }
        return counterPositiveElements;
    }

}
