package ru.job4j.list;

import org.junit.Test;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 27.10.2018
 */

public class UserConvertTest {
    /**
     * Тест проверяет корректность преобразования списка объектов User в HashMap
     */
    @Test
    public void whenListOfUserThenHashMap() {
        UserConvert userConvert = new UserConvert();
        List<User> list = new ArrayList();
        User user1 = new User(222, "igor", "spb");
        User user2 = new User(111, "petr", "bryansk");
        User user3 = new User(333, "andrew", "msk");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        HashMap<Integer, User> expect = new HashMap<>();
        expect.put(111, user2);
        expect.put(222, user1);
        expect.put(333, user3);
        HashMap<Integer, User> result = userConvert.process(list);
        assertThat(result, is(expect));
    }
} 