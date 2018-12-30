package ru.job4j.sort;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 30.12.2018
 */

public class SortUser {
    /**
     * Метод конвертирует список объектов User в TreeSet
     *
     * @return TreeSet<User>
     */
    public Set<User> sort(List<User> users) {
        return users.stream().sorted().collect(Collectors.toSet());
    }

    /**
     * Метод sortNameLength.
     * Cортировка по длине имени.
     *
     * @param list список пользвателей.
     * @return отсортированный список.
     */
    public List<User> sortNameLength(List<User> list) {
        return list.stream().sorted(
                Comparator.comparing(User::getAge)
        ).collect(Collectors.toList());
    }

    /**
     * Метод sortByAge
     * Сортировка пользователей по возрасту по возрастанию.
     *
     * @param list список пользвателей.
     * @return отсортированный список.
     */
    public List<User> sortByAge(List<User> list) {
        return list.stream().sorted(
                Comparator.comparingInt(User::getAge)
        ).collect(Collectors.toList());
    }

    /**
     * Метод sortByAllFields.
     * Cортировка по обоим полям, сначала сортировка по имени в лексикографическом порядке, потом по возрасту.
     *
     * @param list список пользвателей.
     * @return отсортированный список.
     */
    public List<User> sortByAllFields(List<User> list) {
        return list.stream().sorted(
                Comparator.comparing(User::getName).thenComparing(User::getAge)
        ).collect(Collectors.toList());
    }

}