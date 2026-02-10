package org.example.endterm_course_api.service;

import org.example.endterm_course_api.exception.ResourceNotFoundException;
import org.example.endterm_course_api.model.Book;
import org.example.endterm_course_api.patterns.builder.BookBuilder;
import org.example.endterm_course_api.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repo;

    public BookServiceImpl(BookRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Book> getAll() {
        return repo.findAll();
    }

    @Override
    public Book getById(int id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Book with id " + id + " not found"
                        ));
    }

    @Override
    public Book create(String bookType, String name, String author) {
        Book book = new BookBuilder()
                .type(bookType)
                .name(name)
                .author(author)
                .build();

        return repo.save(book);
    }

    @Override
    public Book update(int id, String name, String author) {
        Book existing = getById(id);
        existing.setName(name);
        existing.setAuthor(author);
        return repo.save(existing);
    }

    @Override
    public void delete(int id) {
        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException(
                    "Book with id " + id + " not found"
            );
        }
        repo.deleteById(id);
    }
}
