package module02.Tasks2_3.task03;

import module02.Tasks2_3.task01.Book;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    //Methods
    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int i = 1;
        for (Book book : books) {
            System.out.println(i + ". \"" + book.getTitle() + "\" by \"" + book.getAuthor() + "\", "
                    + book.getYearOfPublication());
            i++;
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equals(author))
                System.out.println("\"" + book.getTitle() + "\", " + book.getYearOfPublication());
        }
    }

    //Task 2.3.2 Borrow/return book
    public void borrowBook(String title){
        if (books.stream().anyMatch(book -> book.getTitle().equals(title))){
            System.out.println("Borrowing book \"" + title + "\"...");
            books.removeIf(book -> book.getTitle().equals(title));
        }
        else
            System.out.println("Book " + title + " is not in the library");
    }

    public void returnBook(Book book){
        System.out.println("Returning book \"" + book.getTitle() + "\"...");
        books.add(book);
    }

    public boolean isBookAvailable(String title){
        return books.stream().anyMatch(book -> book.getTitle().equals(title));
    }
}