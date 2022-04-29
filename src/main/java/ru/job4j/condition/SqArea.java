package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result2);
        double result3 = SqArea.square(12.5, 5.5);
        System.out.println(" p = 12.5, k = 5.5, s = 1, real = " + result3);
        double result4 = SqArea.square(23.87, 110);
        System.out.println(" p = 23.87, k = 110, s = 1, real = " + result4);

    }
}
