package ru.job4j.list;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 30.12.2018
 */

public class UserConvert {
    /**
     * Метод конвертирует список объектов User в HashMap
     *
     * @param list типа List<User>
     * @return HashMap<Integer ,   User>, где Integer это id пользователя
     */
    public Map<Integer, User> process(List<User> list) {
        return list.stream().collect(
                Collectors.toMap(User::getId, Function.identity()));
    }
}