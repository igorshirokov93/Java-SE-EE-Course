package ru.job4j.condition;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 07.12.2019
 */

public class TrgArea {
    public static double area(double a, double b, double c) {
        return Math.sqrt(4 * Math.pow(a, 2) * Math.pow(b, 2) - Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2), 2)) / 4;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
        double six = TrgArea.area(3, 4, 5);
        System.out.println("area (3, 4, 5) = " + six);
    }
}