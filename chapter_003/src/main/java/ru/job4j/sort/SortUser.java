package ru.job4j.sort; 
 
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
 
/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 29.10.2018
 */ 
 
public class SortUser {
    /**
     * Метод конвертирует список объектов User в TreeSet
     * @param list типа List<User>
     * @return TreeSet<User>
     */
    public Set<User> sort(List<User> list) {
        return new TreeSet(list);
    }
}