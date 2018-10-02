package ru.job4j.tracker;

import java.util.*;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 28.09.2018.
 */

public class StartUI {

    private final Input input;
    private final Tracker tracker;
    /**
     * Поле признак выхода из программы
     */
    private boolean working = true;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }


    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions(this);
        menu.setRange();
        do {
            menu.show();
            menu.select(input.ask("select:", menu.range));
        } while (this.working);
    }

    /**
     * Запуск программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(), new Tracker()).init();
    }

}