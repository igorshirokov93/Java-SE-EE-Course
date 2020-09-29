package ru.job4j.condition;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 29.09.2020.
 */

public class MultipleSwitchWeek {
    public static void numberOfDay(String name) {
        int value = switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
        System.out.println(value);
    }

    public static void main(String[] args) {
        MultipleSwitchWeek.numberOfDay("Понедельник");
        MultipleSwitchWeek.numberOfDay("Monday");
        MultipleSwitchWeek.numberOfDay("Вторник");
        MultipleSwitchWeek.numberOfDay("Tuesday");
        MultipleSwitchWeek.numberOfDay("Среда");
        MultipleSwitchWeek.numberOfDay("Wednesday");
        MultipleSwitchWeek.numberOfDay("Четверг");
        MultipleSwitchWeek.numberOfDay("Thursday");
        MultipleSwitchWeek.numberOfDay("Пятница");
        MultipleSwitchWeek.numberOfDay("Friday");
        MultipleSwitchWeek.numberOfDay("Суббота");
        MultipleSwitchWeek.numberOfDay("Saturday");
        MultipleSwitchWeek.numberOfDay("Воскресенье");
        MultipleSwitchWeek.numberOfDay("Sunday");
        MultipleSwitchWeek.numberOfDay("Вымышленный");
        MultipleSwitchWeek.numberOfDay("Not exist");
    }
}