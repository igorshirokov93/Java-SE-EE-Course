package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Метод, который принимает массив целочисленных значений и возвращает сумму первого и последнего элемента.$
 * @since 07.10.2020.
 */

public class Sum {
    public static int getSum(int[] array) {
        return array[0] + array[array.length - 1];
    }
}