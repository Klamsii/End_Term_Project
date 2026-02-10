package org.example.endterm_course_api.dto;

public class CreateBookRequest {

    private String bookType;
    private String name;
    private String author;

    public String getBookType() {
        return bookType;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
