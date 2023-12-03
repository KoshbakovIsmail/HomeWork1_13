
public class Main {
    public static void main(String[] args) {
        Author authorJava = new Author("Ki", "Sam", "li");
        Author authorKotlin = new Author("Ky", "li", "Vun");
        Book bookJava = new Book("Java", 1999, authorJava);
        Book bookKotlin = new Book("Kotlin", 1998, authorKotlin);
        Author authorJavaCopy = authorJava;
        Author authorKotlinCopy = authorKotlin;
        Book bookJavaCopy = bookJava;
        Book bookKotlinCopy = bookKotlin;
        System.out.println("authorJava = " + authorJava);
        System.out.println("authorKotlin = " + authorKotlin);
        System.out.println("bookJava = " + bookJava);
        System.out.println("bookKotlin = " + bookKotlin);
        System.out.println("authorJava.hashCode() = " + authorJava.hashCode());
        System.out.println("authorKotlinCopy.hashCode() = " + authorKotlinCopy.hashCode());
        System.out.println("authorJava.hashCode() = " + authorJava.hashCode());
        System.out.println("authorJavaCopy.hashCode() = " + authorJavaCopy.hashCode());
        System.out.println("authorJava.eguals(authorKotlin) = " + authorJava.eguals(authorKotlin));
        System.out.println("authorJava.eguals(authorJavaCopy) = " + authorJava.eguals(authorJavaCopy));
        System.out.println("authorKotlin.eguals(authorKotlinCopy) = " + authorKotlin.eguals(authorKotlinCopy));
        System.out.println("bookJava.eguals(bookKotlin) = " + bookJava.eguals(bookKotlin));
        System.out.println("bookJava.eguals(bookJavaCopy) = " + bookJava.eguals(bookJavaCopy));
        System.out.println("bookKotlin.eguals(bookKotlinCopy) = " + bookKotlin.eguals(bookKotlinCopy));

    }
}