package ru.job4j.condition;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 29.09.2020.
 */

public class SwitchWeek {
    public static void nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Несуществующий день недели";
                break;
        }
        System.out.println(name);
    }

    public static void main(String[] args) {
        SwitchWeek.nameOfDay(1);
        SwitchWeek.nameOfDay(2);
        SwitchWeek.nameOfDay(3);
        SwitchWeek.nameOfDay(4);
        SwitchWeek.nameOfDay(5);
        SwitchWeek.nameOfDay(6);
        SwitchWeek.nameOfDay(7);
        SwitchWeek.nameOfDay(8);
        SwitchWeek.nameOfDay(9);
    }
}