package week7.day2.ExamTest3;

public class BookDTO {

    private String bookNo;
    private String bookTitle;
    private String bookAuthor;
    private int bookTime;
    private int bookPrice;

    private String bookPublisher;

    public BookDTO(String bookNo, String bookTitle, String bookAuthor, int bookTime, int bookPrice, String bookPublisher) {

        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookTime = bookTime;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookTime() {
        return bookTime;
    }

    public void setBookTime(int bookTime) {
        this.bookTime = bookTime;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
}
