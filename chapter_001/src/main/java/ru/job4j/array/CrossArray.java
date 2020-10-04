package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Заданы два числовых массива. Нужно вывести на консоль числа, которые есть одновременно в первом и втором массиве.$
 * @since 04.10.2020.
 */

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    System.out.println(right[j]);
                }
            }
        }
    }
}