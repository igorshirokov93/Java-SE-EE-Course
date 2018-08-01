package ru.job4j.loop;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * Вычисление суммы четных чисел в диапазоне указанных значений
     *
     * @param start  Начальное значение.
     * @param finish Конечное значение.
     * @return Сумма четных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
