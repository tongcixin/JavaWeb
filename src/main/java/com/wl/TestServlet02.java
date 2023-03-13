package com.wl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

//@WebServlet(name = "TestServlet02", urlPatterns = "/TestServlet02")
public class TestServlet02 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init method is called");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Hello World");
    }

    @Override
    public void destroy() {
        System.out.println("destroy method is called");
    }
}
