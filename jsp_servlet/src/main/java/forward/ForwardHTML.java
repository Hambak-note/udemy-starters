package forward;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ForwardHTML")
public class ForwardHTML extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //FORWARD시에 서버 내부 같은 어플리케이션 내부 파일 이동
        System.out.println("클라이언트는 " + request.getRequestURI() + " 호출하셨습니다.");
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/login.html");
        rd.forward(request, response);
    }
}
