package org.library.model;

import org.library.builder.NewspaperBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Newspaper extends Content implements Serializable {


    public Newspaper(Long id, String description, String name, LocalDate date, String body, Author author) {
        super(id, description, name, date, body, author, ContentType.NEWSPAPER);
    }

    public Newspaper() {
    }

    public static synchronized NewspaperBuilder createBuilder() {
        return NewspaperBuilder.init();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Newspaper newspaper = (Newspaper) o;
        return contentType == newspaper.contentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), contentType);
    }
}
