package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Реализуй метод, который принимает массив целочисленных значений, сравнивает между собой первый
 * и последний элемент и возвращает максимальное из двух значений.$
 * @since 07.10.2020.
 */

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        if (array[0] > array[array.length - 1]) {
            return array[0];
        } else
            return array[array.length - 1];
    }
}