package ru.job4j.search;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 24.10.2018
 */

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Igor", "Shirokov", "2640366", "Kirishi")
        );
        List<Person> persons = phones.find("Igor");
        assertThat(persons.iterator().next().getName(), is("Igor"));
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Igor", "Shirokov", "2640366", "Kirishi")
        );
        List<Person> persons = phones.find("Shirokov");
        assertThat(persons.iterator().next().getSurname(), is("Shirokov"));
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Igor", "Shirokov", "2640366", "Kirishi")
        );
        List<Person> persons = phones.find("264");
        assertThat(persons.iterator().next().getPhone(), is("2640366"));
    }

    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Igor", "Shirokov", "2640366", "Kirishi")
        );
        List<Person> persons = phones.find("Kirishi");
        assertThat(persons.iterator().next().getAddress(), is("Kirishi"));
    }

    @Test
    public void whenNotFoundPerson() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Igor", "Shirokov", "2640366", "Kirishi")
        );
        List<Person> persons = phones.find("Arsentev");
        assertThat(persons.isEmpty(), is(true));
    }
} 