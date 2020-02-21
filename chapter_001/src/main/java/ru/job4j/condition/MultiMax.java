package ru.job4j.condition;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 21.02.2020
 */

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean variable = first > second;
        int maxim = variable ? first : second;
        boolean result = maxim > third;
        return result ? maxim : third;
    }
}