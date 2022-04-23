package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short heightwoman) {
        return (heightwoman - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        short heightwoman = 170;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(heightwoman);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
