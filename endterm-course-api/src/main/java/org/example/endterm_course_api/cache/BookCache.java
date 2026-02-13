package org.example.endterm_course_api.cache;

import org.example.endterm_course_api.model.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookCache {

    private static BookCache instance;

    private final Map<String, List<Book>> cache = new HashMap<>();

    private BookCache() {}

    public static BookCache getInstance() {
        if (instance == null) {
            instance = new BookCache();
        }
        return instance;
    }

    public List<Book> get(String key) {
        return cache.get(key);
    }

    public void put(String key, List<Book> value) {
        cache.put(key, value);
    }

    public void clear() {
        cache.clear();
    }
}