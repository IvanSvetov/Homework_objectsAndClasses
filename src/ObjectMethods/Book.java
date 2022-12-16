package ObjectMethods;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publishingYear;

    public Book(Author author, String bookName, int publishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public Author getAuthotName() {
        return this.author;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + this.bookName + ", Автор: " + author.toString() + ", год публикации: " + getPublishingYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}
