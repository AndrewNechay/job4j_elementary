package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndmultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);

    }

    public static double appleAndpear(double first, double second) {
        return apple(first, second) + pear(first, second);
    }

    public static double appleAndpearAndsumAndmultiply(double first, double second) {
        return sum(first, second) + multiply(first, second) + apple(first, second) + pear(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndmultiply(10, 20));
        System.out.println("Результат вычитания:" + apple(300, 200));
        System.out.println("Результат деления:" + pear(1000, 200));
        System.out.println("Разность 2х чисел и деление 2х чисел " + appleAndpear(1000, 100));
        System.out.println("Сумма вычисления 4х операций из MathFunction " + appleAndpearAndsumAndmultiply(10, 10));
    }
}