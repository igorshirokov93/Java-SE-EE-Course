package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    PrintStream stdout = System.out;
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    String menu = new StringBuilder().append("0. Добавление новой заявки")
            .append(System.lineSeparator())
            .append("1. Список всех заявок")
            .append(System.lineSeparator())
            .append("2. Изменение заявки")
            .append(System.lineSeparator())
            .append("3. Удаление заявки")
            .append(System.lineSeparator())
            .append("4. Поиск заявки по ID")
            .append(System.lineSeparator())
            .append("5. Поиск заявки по имени")
            .append(System.lineSeparator())
            .append("6. Выход")
            .append(System.lineSeparator()).toString();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll().get(0).getName(), is("test name"));
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void whenDeleteThenTrackerHasDeleteValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Item item1 = tracker.add(new Item("test name1", "desc1"));
        Input input = new StubInput(new String[]{"3", item.getId(), "yes", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll().get(0).getName(), is("test name1"));
    }

    @Test
    public void whenFindByIdThenTrackerHasItemWithSameName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }

    @Test
    public void whenShowAllThenPrintItemstoScreen() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Item item1 = tracker.add(new Item("test name1", "desc1"));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                        .append(this.menu)
                        .append("------------ Список всех заявок -------------")
                        .append(System.lineSeparator())
                        .append("|| id is: " + '\'' + item.getId() + '\'' + ", name is: " + '\'' + item.getName() + '\'' + "||")
                        .append(System.lineSeparator())
                        .append("|| id is: " + '\'' + item1.getId() + '\'' + ", name is: " + '\'' + item1.getName() + '\'' + "||")
                        .append(System.lineSeparator())
                        .append("---------------------------------------------")
                        .append(System.lineSeparator())
                        .append(this.menu)
                        .append("Выбран выход из программы. До свидания!")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }

    @Test
    public void whenFindByIdThenPrintItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Item item1 = tracker.add(new Item("test name1", "desc1"));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                        .append(this.menu)
                        .append("------------ Заявка с id " + item.getId() + " : || id is: " + '\'' + item.getId() + '\'' + ", name is: " + '\'' + item.getName() + '\'' + "||")
                        .append(System.lineSeparator())
                        .append(this.menu)
                        .append("Выбран выход из программы. До свидания!")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }

    @Test
    public void whenFindByNameThenPrintItems() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Item item1 = tracker.add(new Item("test name1", "desc1"));
        Item item2 = tracker.add(new Item("test name", "desc2"));
        Input input = new StubInput(new String[]{"5", item.getName(), "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                        .append(this.menu)
                        .append(" Имя заявки: test name Описание заявки: desc ID заявки: " + item.getId())
                        .append(System.lineSeparator())
                        .append(" Имя заявки: test name Описание заявки: desc2 ID заявки: " + item2.getId())
                        .append(System.lineSeparator())
                        .append("-------------------------------------------")
                        .append(System.lineSeparator())
                        .append(this.menu)
                        .append("Выбран выход из программы. До свидания!")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }

}

