package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Нужно реализовать два метода - первый возвращает размер массива,
 * второй - количество элементов в ряду, номер которого мы передаём в метод.$
 * @since 10.10.2020.
 */

public class TwoDArraySize {
    public static int getCountRow(int[][] array) {
        return array.length;
    }

    public static int getCountCellInRow(int[][] array, int row) {
        return array[row].length;
    }
}