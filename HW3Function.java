package com.dmdev.homeWork;

/**
 * Задание 3
 * <p>
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */


public class HW3Function {

    public static void main(String[] args) {
        int FistRightTriangleA = 12;
        int FistRightTriangleB = 6;
        int SecondRightTriangleA = 10;
        int SecondRightTriangleB = 10;

        System.out.println(TriangleAreaCalculator(FistRightTriangleA, FistRightTriangleB));
        System.out.println(TriangleAreaCalculator(SecondRightTriangleA,SecondRightTriangleB));
        System.out.println(comparisonOfAreas(FistRightTriangleA, FistRightTriangleB, SecondRightTriangleA, SecondRightTriangleB));
    }

    public static String comparisonOfAreas(int FistA, int FistB, int SecondA, int SecondB) {
        String result = "";
        if (TriangleAreaCalculator(FistA, FistB) > TriangleAreaCalculator(SecondA, SecondB)) {
            result = "Первый треугольник больше второго";
        } else if ((TriangleAreaCalculator(FistA, FistB) < TriangleAreaCalculator(SecondA, SecondB))) {
            result = "Первый треугольник меньше второго";
        } else if ((TriangleAreaCalculator(FistA, FistB) == TriangleAreaCalculator(SecondA, SecondB))) {
            result = "Первый треугольник равен второму";
        }
        return result;
    }

    public static double TriangleAreaCalculator(int a, int b) {
        double result = 0;
        result = ((double) a * b) / 2;
        return result;
    }


}
