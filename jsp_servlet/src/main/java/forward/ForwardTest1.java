package forward;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/forward1")
public class ForwardTest1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        req.setAttribute("upperid", id.toUpperCase());

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        RequestDispatcher rd = req.getRequestDispatcher("/forward2");
        rd.forward(req, resp);
        System.out.println("forwardTest1 클래스입니다");
    }
}
