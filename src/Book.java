public class Book {
    private String bookName;
    private Author author;
    private int publishingYear;

    public Book(Author author, String bookName, int publishingYear) {
        this.author = new Author(author.getAuthorName(), author.getAuthorSurname());
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

}
