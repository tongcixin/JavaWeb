package com.wl.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        String data = "itcast";
        // 获取字节输出流对象
//			OutputStream out = response.getOutputStream();
//			out.write(data.getBytes());// 输出信息
        //使用getWriter()方法发送消息体
        PrintWriter print = response.getWriter();
        print.write(data); // 输出信息


    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
