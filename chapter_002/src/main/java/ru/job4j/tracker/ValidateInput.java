package ru.job4j.tracker;
 import java.util.List; 
 
 /**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 01.10.2018.
 */ 
 
 public class ValidateInput extends ConsoleInput {
    @Override
    public int ask(String question, List<Integer> range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста введите цифру");
            } catch (MenuOutException moe) {
                System.out.println("Пожалуйста введите данные в диапазоне меню");
            }
        } while (invalid);
        return value;
    }
}