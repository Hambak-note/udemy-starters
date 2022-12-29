package week6.day2;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MonthEmployee {

    public static void main(String[] args) {
        ArrayList<String> resultList = new MonthEmployee().getEmployees();
        System.out.println(resultList.toString());
    }

    public ArrayList<String> getEmployees() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<String> resultList = new ArrayList<>();

        try{
            Class.forName(ConnectionInform.DRIVER_CLASS);
            con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERANME, ConnectionInform.PASSWORD);

            //제외할 월 입력받음
            Scanner sc = new Scanner(System.in);
            System.out.print("제외할 월 입력 : ");
            int exceptMonth = sc.nextInt();
            st = con.createStatement();

            String sql =
                    "SELECT MONTH(hire_date) hire_month, SUM(salary) total_salary " +
                            "FROM employees " +
                            "WHERE MONTH(hire_date) <> " + exceptMonth +
                            " GROUP BY MONTH(hire_date)";

            String sql2 = "select * from employees where employee_id = 100";

            rs = st.executeQuery(sql);

            while (rs.next()) {
                String month = rs.getString("hire_month");
                String totalSalary = rs.getString("total_salary");
                resultList.add(month+" " +totalSalary);

            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                rs.close();
                st.close();
                con.close();

            } catch(SQLException e){
                System.out.println("연결 해제 실패");
            }
        }
        return resultList;
    }

}
