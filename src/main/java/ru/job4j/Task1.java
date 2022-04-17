package ru.job4j;

public class Task1 {
    public static void main(String[] args) {

        byte age = 27;     //тип байт потому как выше не имет смысла, будет тяжелее файл
        System.out.println(age);
        char gender = 'M';   // тип данных "символ"
        System.out.println(gender);
        short height = (175); // т.к. тип "байт" доходит максимум до 127 байтов
        System.out.println(height);
        int brick = (40000); // т.к. на 100 к.м. дома надо около 40 тысяч кирпичей, а тип данных "шорт" располагает
        // максимум на 32 тысячи
        System.out.println(brick);
        int bacteria = 10000000; // 10 в 7 степени = 10 миллионов бактерий
        System.out.println(bacteria);
        int spaceobjects = (149597870); // единици измерения в астрономии примерно равна среднему
        // расстоянию земли от солнца - 149597870 кмю
        System.out.println(spaceobjects);
        char jobPermission = 'Y'; // разрешение на работу- да
        System.out.println(jobPermission);
        short filesize = (1494); // размер этого файла - 1439 байт, "байт" не подойдёт уже
        System.out.println(filesize);

    }
}
