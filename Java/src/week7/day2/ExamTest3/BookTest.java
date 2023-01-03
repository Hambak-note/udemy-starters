package week7.day2.ExamTest3;

import java.sql.SQLException;
import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("정보입력");
        System.out.print("도서번호 : ");
        String bookNo = sc.nextLine();
        System.out.print("도서명 : ");
        String bookTitle = sc.nextLine();
        System.out.print("저자 : ");
        String bookAuthor = sc.nextLine();
        System.out.print("발행연도 : ");
        int bookTime = sc.nextInt();
        sc.nextLine();
        System.out.print("가격 : ");
        int bookPrice = sc.nextInt();
        sc.nextLine();
        System.out.print("출판사 : ");
        String bookPublisher = sc.nextLine();

        BookDTO bookDTO = new BookDTO(bookNo, bookTitle, bookAuthor, bookTime, bookPrice, bookPublisher);
        BookDAO bookDAO = new BookDAO();
        bookDAO.insertBook(bookDTO);
        bookDAO.selectBook();
    }
}
