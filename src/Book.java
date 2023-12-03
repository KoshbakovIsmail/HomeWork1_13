import java.util.Objects;

public class Book {
    private String bookTitle;
    private int yearOfPublication;
    private Author author;

    public Book(String bookTitle, int yearOfPublication, Author author) {
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getBookTitle() {
        return getBookTitle();
    }

    public int getYearOfPublication() {
        return getYearOfPublication();
    }

    public Author getAuthor() {
        return getAuthor();
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean eguals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookTitle, book.bookTitle) && Objects.equals(yearOfPublication, book.yearOfPublication) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(bookTitle, yearOfPublication, author);
    }

    public String toString() {
        return "Название книги-" + bookTitle + " год идание-" + yearOfPublication + " Автор- " + author;
    }

}
