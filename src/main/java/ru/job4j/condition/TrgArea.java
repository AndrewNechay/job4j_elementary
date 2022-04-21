package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double first = (a + b + c) / 2;
        double second = Math.sqrt(first - a) * (first * b) * (first * c);
        return second;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(6, 6, 6);
        System.out.println("area (6,6,6) = " + rsl);

    }
}
