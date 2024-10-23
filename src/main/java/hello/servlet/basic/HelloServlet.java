package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("req = " + req + ", resp = " + resp);

        String userName = req.getParameter("username");
        System.out.println("userName = " + userName);

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("hello " + userName);

    }
}
