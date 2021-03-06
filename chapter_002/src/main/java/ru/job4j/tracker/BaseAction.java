package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 3.10.2018.
 */

public abstract class BaseAction implements UserAction {
    /**
     * Поле номер меню
     */
    private int menuKey;
    /**
     * Поле строка меню
     */
    private String menuString;

    /**
     * Конструктор.
     *
     * @param menuKey    объект типа int
     * @param menuString объект типа String
     */
    public BaseAction(int menuKey, String menuString) {
        this.menuKey = menuKey;
        this.menuString = menuString;
    }

    /**
     * Метод возвращает информацию о данном пункте меню.
     *
     * @return Строка меню
     */
    @Override
    public String info() {
        return this.menuKey + this.menuString;
    }

    /**
     * Метод возвращает ключ опции.
     *
     * @return пункт меню
     */
    @Override
    public int key() {
        return this.menuKey;
    }
}