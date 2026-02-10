package org.example.endterm_course_api.controller;

import org.example.endterm_course_api.dto.CreateBookRequest;
import org.example.endterm_course_api.model.Book;
import org.example.endterm_course_api.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public Book create(@RequestBody CreateBookRequest request) {
        return service.create(
                request.getBookType(),
                request.getName(),
                request.getAuthor()
        );
    }

    @PutMapping("/{id}")
    public Book update(
            @PathVariable int id,
            @RequestBody CreateBookRequest request
    ) {
        return service.update(id, request.getName(), request.getAuthor());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
