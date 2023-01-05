package session;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/mypage")
public class MyPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //요청 보낸 브라우저 세션 있니
        //true(두번째이후 요청)이면 이전 생성 session 공유
        HttpSession session = req.getSession();
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        //로그인id 공유
        if (session.getAttribute("sessionid") != null) {
            out.println("<h1>" + session.getAttribute("sessionid") + " 님의 회원정보 페이지입니다.</h1>");
        }

        else{
            out.println("<h1><a href='loginsession?id=test&pw=1111'>로그인</a> 먼저 하세요. 그래야 회원정보를 보여줍니다.</h1>");

        }
    }
}
