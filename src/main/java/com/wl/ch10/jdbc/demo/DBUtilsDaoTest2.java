package com.wl.ch10.jdbc.demo;
import java.sql.SQLException;
import com.wl.ch10.User;
public class DBUtilsDaoTest2 {
	private static DBUtilsDao dao = new DBUtilsDao();
	public static void testupdate() throws SQLException {
		User user = new User();
		user.setName("zhaoliu");
		user.setPassword("666777");
		user.setId(4);
		boolean b = dao.update(user);
		System.out.println(b);
	}
	public static void main(String[] args) throws SQLException {
		testupdate();
	}
}
