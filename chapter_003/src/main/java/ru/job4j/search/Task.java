package ru.job4j.search;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 25.10.2018
 */

public class Task {
    /**
     * Поле описание задачи
     */
    private String desc;
    /**
     * Поле приоритет задачи
     */
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    /**
     * Геттер описания задачи
     *
     * @return типа String
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Геттер приоритета задачи
     *
     * @return типа Int
     */
    public int getPriority() {
        return priority;
    }
}