package Librari;

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
        }
        System.out.println("Имя автора не указано.");
    }

    public void setLastNameAuthor(String lastNameAuthor) {
        if (lastNameAuthor != null) {
            this.lastNameAuthor = lastNameAuthor;
        }
        System.out.println("Имя автора не указано.");
    }

    @Override
    public String toString() {
        return firstNameAuthor + " " + lastNameAuthor;
    }
}
