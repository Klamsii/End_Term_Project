package org.example.endterm_course_api.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("EBOOK")
public class EBook extends Book {

    public EBook() {}

    public EBook(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
