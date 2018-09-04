package ru.job4j.array;
/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 05.08.2018.
 */
public class Turn {
    public int[] turn(int[] array) {
        for (int i = 0; i != array.length / 2; i++) {
            int value = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = value;
        }
        return array;
    }
} 