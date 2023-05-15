package com.wl.ch10.jdbc.example;
import com.wl.ch10.jdbc.example.dao.UsersDao;
public class DeleteUserTest{
    public static void main(String[] args) {
        // 删除操作
        UsersDao usersDao = new UsersDao();
        boolean b = usersDao.delete(4);
        System.out.println(b);
    }
}
