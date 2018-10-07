package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 19.09.2018.
 */

public class Item {
    private String id;
    private String name;
    private String description;
    //  private long create;

    public Item() {
    }

    // public Item(String name, String description, long create) {
    //   this.name = name;
    // this.description = description;
    //  this.create = create;
    // }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    //  public long getCreate() {
    //     return this.create;
    // }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "|| "
               + "id is: " + '\'' + id + '\''
               + ", name is: " + '\'' + name + '\''
               + "||";
    }
}
