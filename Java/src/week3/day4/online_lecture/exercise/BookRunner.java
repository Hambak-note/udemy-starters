package week3.day4.online_lecture.exercise;

public class BookRunner {

    public static void main(String[] args) {
        Book book = new Book(123, "OOP", "Ranga");
        book.addReview(new Review(10, "Great book", 5));
        book.addReview(new Review(101, "bad book", 5));

        System.out.println(book);
    }
}
