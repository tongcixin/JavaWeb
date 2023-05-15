package com.wl.ch10.jdbc.example;
import com.wl.ch10.jdbc.example.dao.UsersDao;
import com.wl.ch10.jdbc.example.domain.User;
public class FindUserByIdTest{
    public static void main(String[] args) {
        UsersDao usersDao = new UsersDao();
        User user = usersDao.find(1);
        System.out.println("id为1的User对象的name值为："+user.getUsername());
    }
}
