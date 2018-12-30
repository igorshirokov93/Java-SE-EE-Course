package ru.job4j.search;

import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 30.12.2018
 */

public class PriorityQueue {
    /**
     * Поле список задач
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод вставляет в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     *
     * @param task задача
     */
    public void put(Task task) {
        int index = tasks.stream().filter(
                tasks -> tasks.getPriority() < task.getPriority()
        ).collect(Collectors.toList()).size();
        this.tasks.add(index, task);
    }

    /**
     * Метод возвращает первую задачу из списка
     * Задача удаляется
     *
     * @return типа Task
     */
    public Task take() {
        return this.tasks.poll();
    }
}