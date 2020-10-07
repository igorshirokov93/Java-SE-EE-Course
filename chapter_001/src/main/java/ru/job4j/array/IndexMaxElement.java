package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Метод должен вернуть индекс элемента который является максимальным из двух: первый элемент и последний элемент.$
 * @since 07.10.2020.
 */

public class IndexMaxElement {
    public static int getIndexMax(int[] array) {
        return array[0] > array[array.length - 1] ? 0 : array.length - 1;
    }
}