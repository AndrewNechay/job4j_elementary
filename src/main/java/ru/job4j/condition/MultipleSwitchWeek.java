package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        int value = switch (name) {
            case "Понедельник", "Monday" -> 1;
            default -> -1;
        };
        return value;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Monday"));
        System.out.println(numberOfDay("Понедельник"));
        System.out.println(numberOfDay("Вторник"));
    }
}