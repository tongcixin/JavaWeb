package com.wl.ch11.example;
import java.sql.SQLException;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
public class ResultSetTest3 {
    public static void testColumnListHandler() throws SQLException {
        BaseDao basedao = new BaseDao();
        String sql = "select * from user";
        Object arr = (Object) basedao.query(sql,
                new ColumnListHandler("name"));
        System.out.println(arr);
    }
    public static void main(String[] args) throws SQLException {
        testColumnListHandler();
    }
}
