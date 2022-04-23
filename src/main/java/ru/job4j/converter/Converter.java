package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float bit = value / 70;
        return bit;
    }

    public static float rubleToDollar(float value) {
        float bit = value / 60;
        return bit;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("120 rules are " + dollar + " dollar");

    }
}
