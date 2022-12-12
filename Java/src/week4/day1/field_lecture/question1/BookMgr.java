package week4.day1.field_lecture.question1;

public class BookMgr {

    Book[] booklist;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist(){
        for(Book book : booklist){
            System.out.println(book.getTitle());
        }
    }

    public void printTotalPrice(){
        int sum = 0;
        for(Book book : booklist){
            sum += book.getPrice();
        }
        System.out.println("전체 책 가격의 합 : " + sum);
    }
}
