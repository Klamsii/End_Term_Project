package org.example.endterm_course_api.dto;

public class BookWithAuthor {

    private int id;
    private String name;
    private String format;
    private String author;

    public BookWithAuthor(int id, String name, String format, String author) {
        this.id = id;
        this.name = name;
        this.format = format;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public String getAuthor() {
        return author;
    }
}
