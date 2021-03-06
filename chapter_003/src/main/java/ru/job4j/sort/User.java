package ru.job4j.sort;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 29.10.2018
 */

public class User implements Comparable<User> {
    /**
     * Поле имя пользователя
     */
    private String name;
    /**
     * Поле возраст пользователя
     */
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     * Метод для сравнения двух пользователей по возрасту
     *
     * @param o типа User
     * @return int -1, 0, 1
     */
    @Override
    public int compareTo(User o) {
        return Integer.compare(this.age, o.age);
    }
}