package ru.job4j.condition;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 05.12.2019
 */

public class PointTwo {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = distance(33, 0, 0, 44);
        System.out.println("result (33, 0) to (0, 44) " + result1);
        double result2 = distance(0, 11, 60, 0);
        System.out.println("result (0, 11) to (60, 0) " + result2);
        double result3 = distance(4, 3, 5, 2);
        System.out.println("result (4, 3) to (5, 2) " + result3);
        double result4 = distance(-2, -3, -6, 0);
        System.out.println("result (-2, -3) to (-6, 0) " + result4);
    }
}