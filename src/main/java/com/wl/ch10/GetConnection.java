package com.wl.ch10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class GetConnection {
    Connection conn = null;
    public Connection getConnection() throws ClassNotFoundException {
        String driver="com.mysql.cj.jdbc.Driver";                //驱动路径
        String url= "jdbc:mysql://localhost:3306/jdbc?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8";      //数据库地址
        String user="root";                                //访问数据库的用户名
        String password="tongcixin";                            //用户密码
        Class.forName(driver);
        try {
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //返回Connection对象
        return conn;
    }
}