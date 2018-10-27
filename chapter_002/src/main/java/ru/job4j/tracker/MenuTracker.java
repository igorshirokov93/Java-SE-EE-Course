package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 28.09.2018.
 */

public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();

    List<Integer> range = new ArrayList<>();

    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод заполняет список номерами пунктов.
     */
    public void setRange() {
        for (UserAction action : actions) {
            range.add(action.key());
        }
    }

    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLength() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions(StartUI ui) {
        this.actions.add(this.new AddItem(0, ". Добавление новой заявки"));
        this.actions.add(this.new ShowItems(1, ". Список всех заявок"));
        this.actions.add(this.new EditItem(2, ". Изменение заявки"));
        this.actions.add(this.new DeleteItem(3, ". Удаление заявки"));
        this.actions.add(this.new FindItemById(4, ". Поиск заявки по ID"));
        this.actions.add(this.new FindItemsByName(5, ". Поиск заявки по имени"));
        this.actions.add(this.new ExitProgram(6, ". Выход", ui));
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    public class AddItem extends BaseAction {
        public AddItem(int menuKey, String menuString) {
            super(menuKey, menuString);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Добавление новой заявки --------------");
            String name = input.ask("Введите имя заявки : ");
            String desc = input.ask("Введите описание заявки : ");
            Item item = new Item(name, desc);
            tracker.add(item);
            System.out.println("Новая заявка с getId : " + item.getId());
        }
    }

    public class ShowItems extends BaseAction {
        public ShowItems(int menuKey, String menuString) {
            super(menuKey, menuString);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Список всех заявок -------------");
            for (Item item : tracker.getAll()) {
                System.out.println(item.toString());
            }
            System.out.println("---------------------------------------------");
        }
    }

    public class EditItem extends BaseAction {
        public EditItem(int menuKey, String menuString) {
            super(menuKey, menuString);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Изменение поступившей заявки --------------");
            String id = input.ask("Введите id заявки : ");
            String name = input.ask("Введите новое имя заявки : ");
            String desc = input.ask("Введите новое описание заявки : ");
            Item item = new Item(name, desc);
            if (tracker.replace(id, item)) {
                System.out.println("------------- Заявка с Id: " + id + " изменена -------------");
            } else {
                System.out.println("------------- Заявка с Id: " + id + " не найдена -------------");
            }
        }
    }

    public class DeleteItem extends BaseAction {
        public DeleteItem(int menuKey, String menuString) {
            super(menuKey, menuString);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Удаление заявки --------------");
            String id = input.ask("Введите id заявки : ");
            Item item = tracker.findById(id);
            String sure = input.ask("Удалить заявку " + item.getName() + " " + item.getDescription() + " ? (yes/no) ");
            if (sure.equals("yes")) {
                if (tracker.delete(id)) {
                    System.out.println("-------------- Заявка с Id: " + id + " удалена ------------");
                } else {
                    System.out.println("-------------- Заявка с Id: " + id + " не найдена ---------");
                }
            }
        }
    }

    public class FindItemById extends BaseAction {
        public FindItemById(int menuKey, String menuString) {
            super(menuKey, menuString);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите id заявки : ");
            Item item = tracker.findById(id);
            if (item != null) {
                System.out.println("------------ Заявка с id " + id + " : " + item);
            } else {
                System.out.println("------------ Заявка с id " + id + " не найдена. Введите корректный id.");
            }
        }
    }

    public class FindItemsByName extends BaseAction {
        public FindItemsByName(int menuKey, String menuString) {
            super(menuKey, menuString);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Введите имя заявки : ");
            ArrayList<Item> items = tracker.findByName(name);
            for (Item item : items) {
                if (item != null) {
                    System.out.println(" Имя заявки: " + item.getName()
                            + " Описание заявки: " + item.getDescription()
                            + " ID заявки: " + item.getId());
                }
            }
            System.out.println("-------------------------------------------");
        }
    }

    /**
     * Внутренний класс выход из программы
     */
    public class ExitProgram extends BaseAction {
        private final StartUI ui;

        /**
         * Конструктор
         *
         * @param menuKey    типа int
         * @param menuString типа String
         */
        public ExitProgram(int menuKey, String menuString, StartUI ui) {
            super(menuKey, menuString);
            this.ui = ui;
        }

        /**
         * Метод выход из программы
         *
         * @param input   типа Input
         * @param tracker типа Tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("Выбран выход из программы. До свидания!");
            this.ui.setWorking(false);
        }
    }

}