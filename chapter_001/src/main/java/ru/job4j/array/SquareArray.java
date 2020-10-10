package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Создай массив размером 2 на 2, заполни его значениями от 1 до 4.$
 * @since 10.10.2020.
 */

public class SquareArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2}, {3, 4}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}