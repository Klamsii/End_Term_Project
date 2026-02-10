package org.example.endterm_course_api.service;

import org.example.endterm_course_api.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAll();

    Book getById(int id);

    Book create(String bookType, String name, String author);

    Book update(int id, String name, String author);

    void delete(int id);
}
