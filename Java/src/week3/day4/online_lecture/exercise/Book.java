package week3.day4.online_lecture.exercise;

import java.util.ArrayList;

public class Book {

    private int id;
    private String name;
    private String author;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Review review){
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
