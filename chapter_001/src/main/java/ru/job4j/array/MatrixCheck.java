package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 07.08.2018.
 */

public class MatrixCheck {
    /**
     * Метод проверяет, что все элементы по диагоналям true или false.
     * @param data заданный квадратный массив.
     * @return true, если все элементы по диагоналям равны true или false.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean value = data[0][0];
        for (int i = 0; i < data.length; i++) {
            if (data[i][i] != value) {
                result = false;
                break;
            }
        }
        return result;
    }
}
