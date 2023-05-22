package com.wl.ch11.jdbc.dao;
import com.wl.ch11.jdbc.javabean.User;
import com.wl.ch11.jdbc.utils.C3p0Utils;
import org.apache.commons.dbutils.QueryRunner;
import java.sql.SQLException;
public class UpdateDao {
    public static void main(String[] args)throws SQLException {
        // 创建QueryRunner对象
        QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());
        // 写SQL语句
        String sql = "update user set name='hello2',password=111111 where name='hello1'";
        // 调用方法
        int num = runner.update(sql);
        if (num > 0){
            System.out.println("修改成功！");
        }else{
            System.out.println("修改失败！");
        }
    }
}
