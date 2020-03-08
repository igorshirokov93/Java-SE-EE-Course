package ru.job4j.condition;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 08.03.2020
 */

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second && first > third) {
            result = second;
        }
        if (second > first && second <= third) {
            result = third;
        }
        return result;
    }
}