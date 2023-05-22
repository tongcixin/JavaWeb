package com.wl.ch11.jdbc.dao;
import com.wl.ch11.jdbc.utils.C3p0Utils;
import org.apache.commons.dbutils.QueryRunner;
import java.sql.SQLException;
public class DeleteDao {
    public static void main(String[] args)throws SQLException {
        // 创建QueryRunner对象
        QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());
        // 写SQL语句
        String sql = "delete from user where name='hello2'";
        // 调用方法
        int num = runner.update(sql);
        if (num > 0){
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败！");
        }
    }
}
