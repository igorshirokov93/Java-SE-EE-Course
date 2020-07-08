package ru.job4j.condition;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $3$
 * @since 08.07.2020
 */

public class Max {
    public static int max(int first, int second) {
        boolean variable = first > second;
        return variable ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(
                first,
                max(second, third)
        );
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(
                max(first, second),
                max(third, fourth)
        );
    }
}