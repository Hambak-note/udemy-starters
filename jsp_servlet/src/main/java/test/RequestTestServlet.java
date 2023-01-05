package test;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/request")
public class RequestTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        //요청정보 추출
        System.out.println(request.getContextPath());// /servlettest
        System.out.println(request.getMethod());//GET
        System.out.println(request.getRequestURI());// /servlettest/request
        System.out.println(request.getServletPath()); // /request
        System.out.println(request.getRemoteAddr()); // ip v6 0:0:0:0:0:0:0:1 =  ip v4 localhost/127.0.0.1
        //처리없다

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>hello output</h1>");// 클라이언트 브라우저 출력
        out.println("<h1>안녕 클라이언트</h1>");// 클라이언트 브라우저 출력
        out.println("<script src='" +request.getContextPath() + "/jquery-3.6.1.min.js'></script>");// 클라이언트 브라우저 출력
    }
}
