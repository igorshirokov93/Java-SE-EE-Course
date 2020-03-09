package ru.job4j.condition;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 09.03.2020
 */

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second && second > third) {
            result = second;
        }
        if (third > first && second <= third) {
            result = third;
        }
        return result;
    }
}