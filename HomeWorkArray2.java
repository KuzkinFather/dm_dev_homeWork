package com.dmdev.lesson7.homework;

import java.util.Arrays;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */


public class HomeWorkArray2 {

    public static void main(String[] args) {
        char[] value = {'a', '6', 'y', 'P', 'T', 'q', '9', '+' };

        int[] result = changeArray(value);
        System.out.println(Arrays.toString(result));
    }

    public static int[] changeArray(char[] value) {
//  Creating an integer array equal in length to the array of characters
        int[] resultArray = new int[value.length];
//  I create a loop iterating over each element of the array,
//  I pass each element to a variable that converts characters into integers and add them to a new array
        for (int i = 0, resultValue = 0, indexResultArray = 0; i < value.length; i++) {
            resultValue = value[i];
            resultArray[indexResultArray++] = resultValue;
        }
//  I create a variable for summing all the elements of the array and finding the average value in the future
        int averageValue = 0;
        for (int i = 0; i < resultArray.length; i++) {
            averageValue += resultArray[i];
        }
        averageValue /= resultArray.length;

//  Creating a variable to calculate the required number of array elements that are larger than the average value
        int сountNecessaryNumbers = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] > averageValue) {
                сountNecessaryNumbers++;
            }
        }
//  Creating a new array with the required number of elements
        int[] resultArray2 = new int[сountNecessaryNumbers];
        for (int i = 0, countResultArray2 = 0; i < resultArray.length; i++) {
            if (resultArray[i] > averageValue) {
                resultArray2[countResultArray2++] = resultArray[i];
            }
        }
        return resultArray2;
    }

}
