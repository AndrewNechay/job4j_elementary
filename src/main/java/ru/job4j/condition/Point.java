package ru.job4j.condition;

public class Point {
    static double distance(int x1, int y1, int x2, int y2) {
        //double (10-5)*5+(10-5)*5;
        double first = x2 - x1;
        double second = y2 - y1;
        double three = Math.pow(first, 2);
        double four = Math.pow(second, 2);
       // Math.pow(first, 2);
        double five =  three + four;
        double six = Math.sqrt(five);
        return six;

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0,0) to (2,0)" + result);
        double result2 = Point.distance(0, 0, 5, 5);
        System.out.println("result (0,0) to (5,5)" + result2);
    }
}
