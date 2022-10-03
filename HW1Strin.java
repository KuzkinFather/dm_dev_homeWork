package com.dmdev.lesson10.HomeWork;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class HW1Strin {
    

    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";
        String result = value.replace(" ", "").toUpperCase();
        System.out.println(result);

        char[] charValue = result.toCharArray();
        int stringLenght = result.length();

        String newString = "";

        char previous = charValue[0];
        newString += previous;
        for (int i = 1; i < charValue.length - 1; i++) {
            int nextIndex = i + 1;
            if (nextIndex < stringLenght && charValue[i] != charValue[nextIndex]){
                newString = newString + charValue[i];
            }
        }
        System.out.println(newString);

    }


}
