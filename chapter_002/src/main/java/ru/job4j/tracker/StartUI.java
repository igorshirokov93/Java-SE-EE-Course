package ru.job4j.tracker;

import java.util.*;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 20.09.2018.
 */

public class StartUI {
    private static final String ADD = "0";
    private static final String SHOWALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDBYID = "4";
    private static final String FINDBYNAME = "5";
    private static final String EXIT = "6";
    private final Input input;
    private final Tracker tracker;

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

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            switch (answer) {
                case (ADD):
                    this.createItem();
                    break;
                case (SHOWALL):
                    this.showAll();
                    break;
                case (EDIT):
                    this.editItem();
                    break;
                case (DELETE):
                    this.deleteItem();
                    break;
                case (FINDBYID):
                    this.findById();
                    break;
                case (FINDBYNAME):
                    this.findByName();
                    break;
                case (EXIT):
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный пункт меню");
            }
        }
    }

    private void showAll() {
        System.out.println("------------ Список всех заявок -------------");
        for (Item item : this.tracker.getAll()) {
            System.out.println(item.toString());
        }
        System.out.println("---------------------------------------------");
    }

    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки : ");
        String desc = this.input.ask("Введите описание заявки : ");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    private void editItem() {
        System.out.println("------------ Изменение поступившей заявки --------------");
        String id = this.input.ask("Введите id заявки : ");
        String name = this.input.ask("Введите новое имя заявки : ");
        String desc = this.input.ask("Введите новое описание заявки : ");
        Item item = new Item(name, desc);
        if (this.tracker.replace(id, item)) {
            System.out.println("------------ Заявка обновлена : " + item.toString() + " -----------");
        } else {
            System.out.println("Item not found");
        }
    }

    private void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите id заявки : ");
        if (this.tracker.delete(id)) {
            System.out.println("------------ Заявка с id : " + id + " удалена-----------");
        } else {
            System.out.println("Заявки с данным id не существует.");
        }
    }

    private void findById() {
        String id = this.input.ask("Введите id заявки : ");
        Item item = this.tracker.findById(id);
        if (item != null) {
            System.out.println("------------ Заявка с id " + id + " : " + item);
        } else {
            System.out.println("------------ Заявка с id " + id + " не найдена. Введите корректный id.");
        }
    }

    private void findByName() {
        String name = this.input.ask("Введите имя заявки : ");
        Item[] items = tracker.findByName(name);
        for (Item item : items) {
            if (item != null) {
                System.out.println(" Имя заявки: " + item.getName()
                        + " Описание заявки: " + item.getDescription()
                        + " ID заявки: " + item.getId());
            }
        }
        System.out.println("-------------------------------------------");
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    /**
     * Запуск программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}