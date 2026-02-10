package org.example.endterm_course_api.patterns.builder;

import org.example.endterm_course_api.model.Book;
import org.example.endterm_course_api.model.EBook;
import org.example.endterm_course_api.model.PrintedBook;

public class BookBuilder {

    private String type;
    private String name;
    private String author;

    public BookBuilder type(String type) {
        this.type = type;
        return this;
    }

    public BookBuilder name(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder author(String author) {
        this.author = author;
        return this;
    }

    public Book build() {
        return switch (type.toUpperCase()) {
            case "EBOOK" -> new EBook(name, author);
            case "PRINTED" -> new PrintedBook(name, author);
            default -> throw new IllegalStateException("Invalid book type");
        };
    }
}
