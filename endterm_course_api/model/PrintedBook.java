package org.example.endterm_course_api.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PRINTED")
public class PrintedBook extends Book {

    public PrintedBook() {}

    public PrintedBook(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
