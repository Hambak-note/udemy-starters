package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {
	

	public static void main(String[] args) {
		
		Connection con = null;
		
		try{
			//0. jdbc driver 호출
			Class.forName(ConnectionInform.DRIVER_CLASS);
			
			//1. db연결
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERANME, ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			
			Statement st = con.createStatement();
			
			
			Scanner key = new Scanner(System.in);
			System.out.print("상품명 : ");
			String p_name = key.nextLine();
			System.out.print("가격 : ");
			int price = key.nextInt();
			System.out.print("수량 : ");
			int balance = key.nextInt();
			
			String sql = "insert into product(p_name, price, balance)"
					+ "VALUES('"+p_name + "'," + price + "," + balance + ")";
			
			int rowcount = st.executeUpdate(sql);
			
			System.out.println("삽입행의 갯수=" + rowcount);
			
		} catch(ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				System.out.println("연결 해제 성공");
			} catch(SQLException e) {
				System.out.println("연결 해제 실패");
			}
			
		}

	}

}
