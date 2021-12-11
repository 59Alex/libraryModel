package org.library.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Content implements Serializable {
    private Long id;
    private String description;
    private String name;
    private LocalDate date;
    private String body;
    private Author author;
    protected ContentType contentType;

    public Content(Long id, String description, String name, LocalDate date, String body, Author author, ContentType contentType) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.date = date;
        this.body = body;
        this.author = author;
        this.contentType = contentType;
    }

    public Content() {
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", body='" + body + '\'' +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return id.equals(content.id) && description.equals(content.description) && name.equals(content.name) && date.equals(content.date) && body.equals(content.body) && author.equals(content.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, name, date, body, author);
    }
}
