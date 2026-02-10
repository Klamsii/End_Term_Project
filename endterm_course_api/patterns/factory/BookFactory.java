package org.example.endterm_course_api.patterns.factory;

import org.example.endterm_course_api.model.Book;
import org.example.endterm_course_api.model.EBook;
import org.example.endterm_course_api.model.PrintedBook;

public class BookFactory {

    public static Book createBook(String type, String name, String author) {
        return switch (type.toUpperCase()) {
            case "EBOOK" -> new EBook(name, author);
            case "PRINTED" -> new PrintedBook(name, author);
            default -> throw new IllegalArgumentException("Unknown book type: " + type);
        };
    }
}
