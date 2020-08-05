package com.test01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest03_select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//jdbc 를 통한 db 연결 후 mytest 테이블 select 하는 코드 작성
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		String sql = "SELECT * FROM MYTEST";
		
		Class.forName(driver); 
		con = DriverManager.getConnection(url , id , pw);
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
		}
		
		rs.close();
		stmt.close();
		con.close();
		
	}

}
