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

        for (int i = 0; i < data.length; i++) {
            if (data[i][i] != data[0][0] || (data[i][data.length - 1 - i] != data[0][data.length - 1])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
