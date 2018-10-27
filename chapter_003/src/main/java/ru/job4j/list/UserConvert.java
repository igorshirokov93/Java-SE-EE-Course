package ru.job4j.list;

import java.util.HashMap;
import java.util.List;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 27.10.2018
 */

public class UserConvert {
    /**
     * Метод конвертирует список объектов User в HashMap
     *
     * @param list типа List<User>
     * @return HashMap<Integer, User>, где Integer это id пользователя
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> result = new HashMap<>();
        for (User current : list) {
            result.put(current.getId(), current);
        }
        return result;
    }
}