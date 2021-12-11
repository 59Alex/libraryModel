package org.library.model;

import org.library.builder.BookBuilder;
import org.library.builder.NewspaperBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Book extends Content implements Serializable {



    public Book(Long id, String description, String name, LocalDate date, String body, Author author) {
        super(id, description, name, date, body, author, ContentType.BOOK);
    }

    public Book() {
    }

    public static synchronized BookBuilder createBuilder() {
        return BookBuilder.init();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(super.contentType, book.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), super.contentType);
    }
}
