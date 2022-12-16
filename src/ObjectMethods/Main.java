package ObjectMethods;

public class Main {


    public static void main(String[] args) {
        Author author1 = new Author("Lev", "Tolstoy");
        Book bookOne = new Book(new Author(author1.getAuthorName(), author1.getAuthorSurname()),"War and Peace", 1863);
        System.out.println(author1.getAuthorName() + " " + author1.getAuthorSurname() + ", " + bookOne.getBookName() + ", " + bookOne.getPublishingYear());

        bookOne.setPublishingYear(1870);

        System.out.println("Дата публикации " + bookOne.getBookName() + " обновилась = " + bookOne.getPublishingYear());
        System.out.println();

        Author author2 = new Author("Alexandr", "Grin");
        Book bookTwo = new Book(new Author(author2.getAuthorName(), author2.getAuthorSurname()), "Scarlet Sales", 1922);
        System.out.println(author2.getAuthorName() + " " + author2.getAuthorSurname() + ", " + bookTwo.getBookName() + ", " + bookTwo.getPublishingYear());
        System.out.println();

        System.out.println(bookOne);
        System.out.println(bookTwo);
    }
}