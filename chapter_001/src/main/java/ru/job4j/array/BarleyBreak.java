package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 07.04.2020.
 */

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        table[0][0] = 1;
        table[0][1] = 2;
        table[0][2] = 3;
        table[1][0] = 4;
        table[1][1] = 5;
        table[1][2] = 6;
        table[2][0] = 7;
        table[2][1] = 8;
        table[2][2] = 9;
        System.out.println(Arrays.deepToString(table));
    }
}