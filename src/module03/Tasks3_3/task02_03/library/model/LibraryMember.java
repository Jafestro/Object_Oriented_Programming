package module03.Tasks3_3.task02_03.library.model;

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private int memberID;
    private static int totalMembers = 0;
    private ArrayList<Book> borrowedBooks;

    public LibraryMember(String name){
        this.name = name;
        totalMembers++;
        memberID = totalMembers;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
