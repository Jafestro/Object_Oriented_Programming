package module03.Tasks3_3.task02_03.library;

import module03.Tasks3_3.task02_03.library.model.Book;
import module03.Tasks3_3.task02_03.library.model.LibraryMember;
import module03.Tasks3_3.task02_03.library.system.Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library oodi = new Library();
        LibraryMember jake = new LibraryMember("Jake");
        Book book = new Book("The Art of War", "Sun Tzu", "978-0-19-501476-1");
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        Book book2 = new Book("1984", "George Orwell", "978-0-452-28423-4");
        oodi.addBook(book1);
        oodi.addBook(book2);
        oodi.addBook(book);
        oodi.addMember(jake);

        ArrayList<Book> booksThatJakeWantsToBorrow = new ArrayList<>();
        booksThatJakeWantsToBorrow.add(book1);
        booksThatJakeWantsToBorrow.add(book2);

        oodi.borrowBooks(jake, booksThatJakeWantsToBorrow);

        System.out.println(jake.getName() + " has borrowed " + jake.getBorrowedBooks().size() + " books");

        oodi.returnBooks(booksThatJakeWantsToBorrow);
    }
}
