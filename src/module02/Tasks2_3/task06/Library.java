package module02.Tasks2_3.task06;

import module02.Tasks2_3.task04.Book;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

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

    //Task 2.3.5 Library statistics
    public double getAverageRating(){
        return books.stream().mapToDouble(Book::getRating).average().orElse(0);
    }
    public Book getMostReviewedBook(){
        //return books.stream().max(Comparator.comparing(Book::getReview)).orElse(null);
        return books.stream().max((book1, book2) -> (int) (book1.getRating() - book2.getRating())).orElse(null);
    }

    //Task 2.3.6 Library users
    //Methods
    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }
    public void addBookToUser(User user, Book book){
        user.addBook(book);
        borrowBook(book.getTitle());
    }
    public void removeBookFromUser(User user, Book book){
        user.removeBook(book);
        returnBook(book);
    }
    public void displayUsers(){
        System.out.println("Library users:");
        int i = 1;
        for (User user : users) {
            System.out.println(i + ". " + user.getName() + ", " + user.getAge() + " years old");
            i++;
        }
    }
    public void displayUsersBooks(User user){
        System.out.println("Books borrowed by " + user.getName() + ":");
        for (Book book : user.getListOfBorrowedBooks()) {
            System.out.println("\"" + book.getTitle() + "\", " + book.getYearOfPublication());
        }
    }
}