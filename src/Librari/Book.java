package Librari;

import Librari.Author;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int yearPublic;

    public Book(String name, Author author, int yearPublic) {
        this.name = name;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublic == book.yearPublic && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublic);
    }

    @Override
    public String toString() {
        return "Наименование книги: '" + name + '\'' +
                ", автор: " + author +
                ", год публикации: " + yearPublic +
                ';';
    }
}
