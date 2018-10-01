package ru.job4j.tracker; 

import java.util.List;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 20.09.2018.
 */

public interface Input {
    String ask(String question); 
	int ask(String question, List<Integer> range);
} 