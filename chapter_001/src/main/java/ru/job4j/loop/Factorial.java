package ru.job4j.loop;
/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * Вычисление факториала числа
     *
     * @param n Число, для которого считается факториал.
     * @return Результат расчета.
     */
    public int calc(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
} 
