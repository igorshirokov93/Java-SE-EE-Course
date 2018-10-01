package ru.job4j.tracker; 

import java.util.List;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 23.09.2018.
 */

public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    public String ask(String question) {
        return answers[this.position++];
    } 
	@Override
    public int ask(String question, List<Integer> range) {
//        throw new UnsupportedOperationException("Unsupported operation");
        return Integer.parseInt(this.ask(question));
    }
}