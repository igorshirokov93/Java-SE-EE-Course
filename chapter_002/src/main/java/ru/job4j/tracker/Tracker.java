package ru.job4j.tracker;

import java.util.*;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 27.10.2018.
 */

public class Tracker {
    /**
     * Поле список заявок
     */
    private final ArrayList<Item> items = new ArrayList<>();
    /**
     * Поле случайного числа для генерации id
     */
    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    protected Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    public ArrayList<Item> getAll() {
        return this.items;
    }

    public boolean replace(String id, Item item) {
        boolean res = false;
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i) != null && this.items.get(i).getId().equals(id)) {
                item.setId(id);
                this.items.set(i, item);
                res = true;
                break;
            }
        }
        return res;
    }

    public boolean delete(String id) {
        boolean res = false;
        ListIterator<Item> current = this.items.listIterator();
        while (current.hasNext()) {
            if (current.next().getId().equals(id)) {
                current.remove();
                res = true;
                break;
            }
        }
        return res;
    }

    public ArrayList<Item> findByName(String key) {
        ListIterator<Item> current = this.items.listIterator();
        ArrayList<Item> result = new ArrayList<>();
        Item it;
        while (current.hasNext()) {
            it = current.next();
            if (it.getName().equals(key)) {
                result.add(it);
            }
        }
        return result;
    }
} 