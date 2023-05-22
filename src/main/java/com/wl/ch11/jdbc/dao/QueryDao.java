package com.wl.ch11.jdbc.dao;
import com.wl.ch11.jdbc.javabean.User;
import com.wl.ch11.jdbc.utils.C3p0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class QueryDao {
    public static void main(String[] args)throws SQLException {
        // 创建QueryRunner对象
        QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());
       /* // 写SQL语句
        String sql = "select * from user where id=2";
        // 调用方法
        User user = (User) runner.query(sql,new BeanHandler(User.class));
        System.out.println(user.getId()+","+user.getName()+","+user.getPassword());*/
        // 写SQL语句
        String sql = "select * from user";
        // 调用方法
        List<User> list = (List) runner.query(sql,new BeanListHandler(User.class));
        for(User user : list){
            System.out.println(user.getId()+","+user.getName()+","+user.getPassword());
        }

    }
}
