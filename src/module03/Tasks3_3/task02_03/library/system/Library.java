package module03.Tasks3_3.task02_03.library.system;

import module03.Tasks3_3.task02_03.library.model.Book;
import module03.Tasks3_3.task02_03.library.model.LibraryMember;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<LibraryMember> libraryMembers = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember libraryMember){
        libraryMembers.add(libraryMember);
    }

    public void borrowBooks(LibraryMember libraryMember, ArrayList<Book> books){
        libraryMember.getBorrowedBooks().addAll(books);
        this.books.removeAll(books);
    }

    public void returnBooks(ArrayList<Book> books){
        this.books.addAll(books);
    }

    public void reserveABook(Book book, LibraryMember libraryMember){
        libraryMember.getReservedBooks().add(book);
        book.setReserved(true);
    }

    public void cancelReservation(Book book, LibraryMember libraryMember){
        libraryMember.getReservedBooks().remove(book);
        book.setReserved(false);
    }

    public void displayReservedBooks(LibraryMember libraryMember){
        System.out.println("Reserved Books of " + libraryMember.getName() + ", ID: " + libraryMember.getMemberID());
        libraryMember.getReservedBooks().forEach(System.out::println);
    }
}
