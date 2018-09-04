package ru.job4j.array;
/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 04.08.2018.
 */
public class Square {
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i != bound; i++) {
            result[i] = (int) Math.pow(i + 1, 2);
        }
        return result;
    }
} 