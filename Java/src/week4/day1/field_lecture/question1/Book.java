package week4.day1.field_lecture.question1;

public class Book {

    private String title;
    private int price;

    public Book() {
        this.title = null;
        this.price = -1;
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
