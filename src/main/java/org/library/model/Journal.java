package org.library.model;

import org.library.builder.JournalBuilder;
import org.library.builder.NewspaperBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Journal extends Content implements Serializable {


    public Journal(Long id, String description, String name, LocalDate date, String body, Author author) {
        super(id, description, name, date, body, author, ContentType.JOURNAL);
    }

    public Journal() {
    }

    public static synchronized JournalBuilder createBuilder() {
        return JournalBuilder.init();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Journal journal1 = (Journal) o;
        return super.contentType == journal1.contentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), super.contentType);
    }
}
