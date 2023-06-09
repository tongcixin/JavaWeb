package com.wl.session.example01;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

public class ListBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        Collection<Book> books = BookDB.getAll();
        out.write("本站提供的图书有：<br>");
        for (Book book : books) {
//				String url = "/chapter05/PurchaseServlet?id=" + book.getId();
//				out.write(book.getName() + "<a href='" + url 
//						+ "'>点击购买</a><br>");
            String url = "/PurchaseServlet?id=" + book.getId();
            HttpSession s = req.getSession();
            String newUrl = resp.encodeRedirectURL(url);
            out.write(book.getName() + "<a href='" + newUrl + "'>点击购买</a><br>");
        }

    }
}
