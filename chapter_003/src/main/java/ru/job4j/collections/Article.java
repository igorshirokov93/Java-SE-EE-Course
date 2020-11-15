package ru.job4j.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 15.11.2020.
 */

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        Map<String, Integer> map = new HashMap<>();
        String[] wordsOrigin = origin.replaceAll("\\p{P}", "").split("\\s");

        for (String word : wordsOrigin) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        String[] wordsLine = line.split("\\s");

        for (String str : wordsLine) {
            if (map.containsKey(str)) {
                if (map.get(str) > 1) {
                    map.put(str, map.get(str) - 1);
                } else {
                    map.remove(str);
                }
            } else {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}