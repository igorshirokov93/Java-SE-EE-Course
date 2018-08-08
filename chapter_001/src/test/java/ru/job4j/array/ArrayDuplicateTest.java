package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 08.08.2018.
 */

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayDuplicate.remove(input);
        String[] expect = new String[]{"Привет", "Мир", "Супер"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayBezDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = new String[]{"Liza", "Olga", "Liza", "Sveta", "Valeria"};
        String[] result = arrayDuplicate.remove(input);
        String[] expect = new String[]{"Liza", "Olga", "Sveta", "Valeria"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}
