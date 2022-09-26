package com.dmdev.homeWork;

/**
 *Задание 2
 *
 * Даны 3 переменные:
 *
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 *
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 *
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 * */


public class HW2Function {

    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operation = '%';

        System.out.println(calculation1(operand1,operand2,operation));
        System.out.println(calculation2(operand1,operand2,operation));
    }

//    If only the result is needed.

    public static double calculation1 (double operand1, double operand2, char operation){
        double result = 0;
        if (operation == '+') {
            result = operand1 + operand2;
        } else if (operation == '-') {
            result = operand1 - operand2;
        } else if (operation == '*') {
            result = operand1 * operand2;
        } else if (operation == '/') {
            result = operand1 / operand2;
        } else if (operation == '%') {
            result = operand1 % operand2;
        } else {
            System.out.println("invalid character entered for calculation");
        }
        return result;
    }

//   If you need output in the format         34.5 (24.4 + 10.1)
    public static String calculation2 (double operand1, double operand2, char operation) {
        String calculate = "";
        double result = 0;
        if (operation == '+') {
             result = operand1 + operand2;
             calculate = result + " " + "(" + operand1 + " " + operation + " " + operand2 + ")";
        } else if (operation == '-') {
            result = operand1 - operand2;
            calculate = result + " " + "(" + operand1 + " " + operation + " " + operand2 + ")";
        } else if (operation == '*') {
            result = operand1 * operand2;
            calculate = result + " " + "(" + operand1 + " " + operation + " " + operand2 + ")";
        } else if (operation == '/') {
            result = operand1 / operand2;
            calculate = result + " " + "(" + operand1 + " " + operation + " " + operand2 + ")";
        } else if (operation == '%') {
            result = operand1 % operand2;
            calculate = result + " " + "(" + operand1 + " " + operation + " " + operand2 + ")";
        } else {
            calculate = "the variable " + operation + " - was entered incorrectly";
        }
        return calculate;
    }




}
