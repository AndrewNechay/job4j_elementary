package ru.job4j.condition;

public class Triangle {
    public static boolean exist(boolean ab, boolean ac, boolean bc) {
        return ab && ac && bc;
    }

    public static void main(String[] args) {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean result = Triangle.exist(ab + ac > bc, ac + bc > ab, ab + bc > ac);
        System.out.println(result);
    }
}
