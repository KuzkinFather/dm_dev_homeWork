package com.dmdev.homeWork;

/**
 * Задание 1
 * 
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 *
 * Протестировать функцию в main.
 */

public class HW1Function {


    public static void main(String[] args) {
        int minutes = 10;

        System.out.println(whatQuarter1(minutes));
        System.out.println(whatQuarter2(minutes));
    }

//    1-st quarter - 0..15
//    2-nd quarter - 16..30
//    3-rd quarter - 31..45
//    4-th quarter - 46..59

//        If you only need output in digit format

    public static int whatQuarter1(int minutes) {
        int result = 0;
        if (minutes >= 0 && minutes <= 15) {
            result = 1;
        } else if (minutes >= 16 && minutes <= 30) {
            result = 2;
        } else if (minutes >= 31 && minutes <= 45) {
            result = 3;
        } else if (minutes >= 46 && minutes <= 59) {
            result = 4;
        }
        return result;
    }


//    If you need output in a combined format with text

    public static String whatQuarter2(int minutes) {
        String result = " ";
        if (minutes >= 0 && minutes <= 15) {
            result = minutes + " - this number refers to the first (1-st) quarter";
        } else if (minutes >= 16 && minutes <= 30) {
            result = minutes + " - this number refers to the second (2-nd) quarter";
        } else if (minutes >= 31 && minutes <= 45) {
            result = minutes + " - this number refers to the third (3-rd) quarter";
        } else if (minutes >= 46 && minutes <= 59) {
            result = minutes + " - this number refers to the fourth (4-th) quarter";
        } else {
            result = minutes + " - a number less than 0 or greater than 59, entered incorrectly";
        }
        return result;
    }

}
