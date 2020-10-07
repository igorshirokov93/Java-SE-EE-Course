package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Даны два массива чисел. Необходимо определить общий размер массива при их объединении.
 * Объединять ничего не нужно, необходимо только определить общий размер результирующего массива.$
 * @since 07.10.2020.
 */

public class ConcatArray {
    public static int combineSize(int[] a, int[] b) {
        return a.length + b.length;
    }
}