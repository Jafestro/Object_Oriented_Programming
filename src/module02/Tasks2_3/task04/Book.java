package module02.Tasks2_3.task04;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private double rating;
    private String review;

    //Constructor
    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public double getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addReview(String review) {
        this.review = review;
    }
}
