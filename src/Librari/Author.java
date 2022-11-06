package Librari;

import java.util.Objects;

public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;

    public Author(String firstName, String lastNameAuthor) {
        this.firstNameAuthor = firstName;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return lastNameAuthor;
    }

    public void setFirstNameAuthor(String firstNameAuthor) {
        if (firstNameAuthor != null) {
            this.firstNameAuthor = firstNameAuthor;
        } else {
            System.out.println("Имя автора не указано.");
        }
    }

    public void setLastNameAuthor(String lastNameAuthor) {
        if (lastNameAuthor != null) {
            this.lastNameAuthor = lastNameAuthor;
        } else {
            System.out.println("Фамилия автора не указана.");
        }
    }

    @Override
    public String toString() {
        return firstNameAuthor + " " + lastNameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstNameAuthor.equals(author.firstNameAuthor) && lastNameAuthor.equals(author.lastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, lastNameAuthor);
    }
}
