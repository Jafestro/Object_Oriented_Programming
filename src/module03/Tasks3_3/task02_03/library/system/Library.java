package module03.Tasks3_3.task02_03.library.system;

import module03.Tasks3_3.task02_03.library.model.Book;
import module03.Tasks3_3.task02_03.library.model.LibraryMember;

import java.util.ArrayList;

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
}
