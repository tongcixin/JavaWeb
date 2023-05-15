package com.wl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

@WebServlet(name = "TestServlet07", urlPatterns = "/TestServlet07")
public class TestServlet07 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        ServletContext context = this.getServletContext();
        PrintWriter out = response.getWriter();
        InputStream in = context.getResourceAsStream("/WEB-INF/classes/itcast.properties");
        Properties pros = new Properties();
        pros.load(in);
        out.println("Company=" + pros.getProperty("Company") + "<br />");
        out.println("Address=" + pros.getProperty("Address") + "<br />");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
