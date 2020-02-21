package ru.job4j.condition;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 21.02.2020
 */

public class Max {
    public static int max(int first, int second) {
        boolean variable = first > second;
        return variable ? first : second;
    }
}