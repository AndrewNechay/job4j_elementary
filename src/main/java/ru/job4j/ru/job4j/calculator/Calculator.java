package ru.job4j.ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        six = 7;
        four = 10;
        System.out.println(six + four);
        int age = 10;
        int agePlusOne = age + 10;
        age = agePlusOne;
        System.out.println(agePlusOne);
        int age1 = 10;
        age1 = age1 + 10;
        System.out.println(age1);

        int size = 10;
        size = size + 90;
        size = size - 5;
        System.out.println(size);

    }

}
