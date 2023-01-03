package week7.day2.ExamTest3;

import jdbc.member_crud.MemberDTO;
import week6.day2.ConnectionInform;

import java.sql.*;

public class BookDAO {

    public void insertBook(BookDTO bookDTO) throws SQLException {
        Connection con= null;
        PreparedStatement pt = null;

        try{
            Class.forName(ConnectionInform.DRIVER_CLASS);
            con = DriverManager.getConnection
                    (ConnectionInform.JDBC_URL, ConnectionInform.USERANME, ConnectionInform.PASSWORD);

            String sql = "insert into book values (?,?,?,?,?,?)";
            pt = con.prepareStatement(sql);
            pt.setString(1, bookDTO.getBookNo());
            pt.setString(2, bookDTO.getBookTitle());
            pt.setString(3, bookDTO.getBookAuthor());
            pt.setInt(4, bookDTO.getBookTime());
            pt.setInt(5, bookDTO.getBookPrice());
            pt.setString(6, bookDTO.getBookPublisher());
            pt.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            pt.close();
            con.close();
        }

    }

    public void selectBook() throws SQLException {
        Connection con= null;
        PreparedStatement pt = null;
        try{
            Class.forName(ConnectionInform.DRIVER_CLASS);
            con = DriverManager.getConnection
                    (ConnectionInform.JDBC_URL, ConnectionInform.USERANME, ConnectionInform.PASSWORD);

            String sql = "select * from book";
            pt = con.prepareStatement(sql);

            ResultSet rs = pt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("bookNo") + "    " +
                        rs.getString("bookTitle") + "    "
                + rs.getString("bookAuthor") + "    "
                + rs.getInt("bookTime")+ "    "
                + rs.getInt("bookPrice")+ "    "
                +rs.getString("bookPublisher"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            pt.close();
            con.close();
        }

    }
}
