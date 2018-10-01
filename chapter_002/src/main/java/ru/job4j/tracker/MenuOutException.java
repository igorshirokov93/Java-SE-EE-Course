package ru.job4j.tracker; 

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 01.10.2018.
 */ 

 public class MenuOutException extends RuntimeException {
    public MenuOutException(String msg) {
        super(msg);
    }
}