package module02.Tasks2_3.task03;

import module02.Tasks2_3.task01.Book;

public class LibraryMain {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book book2 = new Book("The Silmarillion", "J.R.R. Tolkien", 1977);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book4 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book5 = new Book("The Grapes of Wrath", "John Steinbeck", 1939);
        Book book6 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book7 = new Book("The Adventures of Huckleberry Finn", "Mark Twain", 1884);

        Library library = new Library();
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);

        System.out.println(library.isBookAvailable("The Lord of the Rings"));
    }
}

