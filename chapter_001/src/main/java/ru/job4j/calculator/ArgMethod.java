package ru.job4j.calculator;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 02.06.2020.
 */

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", " + age + " years old");
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        ArgMethod.hello(name, age);
    }
}