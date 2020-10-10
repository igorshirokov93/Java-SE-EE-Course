package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Заполнить массив значениями от 1 до 6, при этом разбить значения на 3 массива: один элемент, два элемента, три элемента.$
 * @since 10.10.2020.
 */

public class NonSquareArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}