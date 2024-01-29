package module02.Tasks2_3.task06;

import module02.Tasks2_3.task04.Book;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> listOfBorrowedBooks = new ArrayList<>();

    //Constructor

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Book> getListOfBorrowedBooks() {
        return listOfBorrowedBooks;
    }

    public void addBook(Book book) {
        listOfBorrowedBooks.add(book);
    }
    public void removeBook(Book book) {
        listOfBorrowedBooks.remove(book);
    }
}
