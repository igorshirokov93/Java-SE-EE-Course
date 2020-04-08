package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 08.04.2020.
 */

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] table = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}