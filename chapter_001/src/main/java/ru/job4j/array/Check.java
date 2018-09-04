package ru.job4j.array;
/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 06.08.2018.
 */
public class Check {
    /**
     * Проверка, что в массиве все элементы одинаковы.
     *
     * @param data Проверяемый массив.
     * @return Результат проверки.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean value = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] != value) {
                result = false;
                break;
            }
        }
        return result;
    }
}