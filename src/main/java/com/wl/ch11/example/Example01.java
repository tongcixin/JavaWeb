package com.wl.ch11.example;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
public class Example01 {
    public static DataSource ds = null;
    static {
        // 获取DBCP数据库连接池实现类对象
        BasicDataSource bds = new BasicDataSource();
        // 设置连接数据库需要的配置信息
        bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        bds.setUrl("jdbc:mysql://localhost:3306/jdbc?serverTimezone=GMT%2B8");
        bds.setUsername("root");
        bds.setPassword("tongcixin");
        // 设置连接池的初始化连接参数
        bds.setInitialSize(5);
        ds = bds;
    }
    public static void main(String[] args) throws SQLException {
        // 获取数据库连接对象
        Connection conn = ds.getConnection();
        //获取数据库连接信息
        DatabaseMetaData metaData = conn.getMetaData();
        //打印数据库连接信息
        System.out.println(metaData.getURL()
                +",UserName="+metaData.getUserName()
                +","+metaData.getDriverName());
    }
}
