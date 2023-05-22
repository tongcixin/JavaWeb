package com.wl.ch11.jdbc.dao;
import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;
import com.wl.ch11.jdbc.javabean.User;
import com.wl.ch11.jdbc.utils.C3p0Utils;
public class InsertDao {
    public static void main(String[] args)throws SQLException{
        // 创建QueryRunner对象
        QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());
        String sql = "insert into user (name,password) values ('hello1',123456)";
        int num = runner.update(sql);
        if (num > 0){
            System.out.println("添加成功！");
        }else{
            System.out.println("添加失败！");
        }
    }
}
