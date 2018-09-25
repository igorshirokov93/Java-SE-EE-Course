package ru.job4j.pseudo;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 25.09.2018.
 */

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        // Получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // Заменяем стандартный вывод на вывод в память для тестирования.
        System.setOut(new PrintStream(out));
        // Выполняем действия пишушие в консоль.
        new Paint().draw(new Square());
        String ln = System.lineSeparator();
        // Проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("++++")
                                .append(ln)
                                .append("+  +")
                                .append(ln)
                                .append("+  +")
                                .append(ln)
                                .append("++++")
                                .append(ln)
                                .toString()
                )
        );
        // Возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }
} 