package ru.job4j.loop;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 22.03.2020
 */

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 0;
        do {
            amount = amount * (1 + percent / 100) - salary;
            year++;
        } while (amount > 0);
        return year;
    }
}