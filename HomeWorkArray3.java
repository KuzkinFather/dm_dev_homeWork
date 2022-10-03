package com.dmdev.lesson7.homework;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами,
 * только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */

public class HomeWorkArray3 {

    public static void main(String[] args) {

        int[] value = {-4, 0, 1, 9, 0, -18, 3};

        converterArray(value);
    }

    public static int[][] converterArray(int[] value) {
//  Here I create three variables by which I want to determine how many positive, negative and zero variables there are in the array.

        int countNegativeElements = 0;
        int countPositiveElements = 0;
        int countZeroElements = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] < 0) {
                countNegativeElements++;
            } else if (value[i] > 0) {
                countPositiveElements++;
            } else countZeroElements++;
        }

//  Here I use these variables as a definition of the length of each of the three required arrays.

        int[] negativeArray = new int[countNegativeElements];
        int[] positiveArray = new int[countPositiveElements];
        int[] zeroArray = new int[countZeroElements];
        for (int i = 0, indexNegativ = 0, indexPositive = 0, indexZero = 0; i < value.length; i++) {
            if (value[i] < 0) {
                negativeArray[indexNegativ++] = value[i];
            } else if (value[i] == 0) {
                zeroArray[indexZero++] = value[i];
            } else positiveArray[indexPositive++] = value[i];
        }

//  Here I create a two-dimensional array and set its size according to the condition, then I change the necessary dimension of this array
//  to a one-dimensional array and display it using the method printArray
        int[][] resultArray = new int[3][];
        resultArray[0] = negativeArray;
        resultArray[1] = zeroArray;
        resultArray[2] = positiveArray;
        printArray(resultArray);
        return resultArray;

    }

//  Here I create a method for iterating over each element of a two-dimensional array
    private static void printArray(int[][] resultArray) {
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }


}
