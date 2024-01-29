package module02.Tasks2_3.task01;

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
                System.out.println(book.getTitle() + ", " + book.getYearOfPublication());
        }
    }
}
