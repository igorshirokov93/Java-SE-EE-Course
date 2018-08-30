package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 30.08.2018.
 */

public class Multi {

    public boolean multidimensional (boolean[][] data) {
        boolean result = false;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[0][0] != data[i][j]) {
                    return result;
                }
            }
        }
        return result = true;
    }
}