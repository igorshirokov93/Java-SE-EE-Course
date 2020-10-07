package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Доступ к элементам в массивах осуществляется при помощи индексов, которые являются целочисленными значениями.
 * При этом индексация начинается с 0 и заканчивается значением имя_массива.length - 1.
 * Расставь значения индексов так, чтобы первый метод возвращал первый элемент массива, а второй метод - последний элемент массива.$
 * @since 07.10.2020.
 */

public class ArrayIndex {

    public static int getFirstElement(int[] array) {
        int rsl = array[0];
        return rsl;
    }

    public static int getLastElement(int[] array) {
        int rsl = array[array.length - 1];
        return rsl;
    }
}