package ru.job4j.sort; 
 
import java.util.*;

 
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
        return new<User> TreeSet(list);
    } 
	
	public List<User> sortNameLength(List<User> list) {
        Comparator<User> compareByNameLength = new Comparator<User>() {
            @Override
             public int compare(User o1, User o2) {
                 return o1.getName().length() - o2.getName().length();
             }
         };
         list.sort(compareByNameLength);
         return list;
    } 
	
	public List<User> sortByAllFields(List<User> list) { 
	Comparator<User> compareByName = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }; 
		Comparator<User> compareByAge = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        }; 
		list.sort(compareByName.thenComparing(compareByAge));
        return list;
    }
}