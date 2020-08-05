package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//db연결 , 연결해제 , commit , rollback
//new 연산자 사용 X , static 으로 생성
public class JDBCTemplate {
	
	//1.연결 메소드
	public static Connection getConnection() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("[ERROR] 드라이버 등록 실패");
			e.printStackTrace();
		}
		//url , id , pw
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url , id , pw);
			con.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("[ERROR] 오라클 연결 실패");
			e.printStackTrace();
		}
		return con;
	}
	
	//2. 연결해제 메소드
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("[ERROR] Connection close 에러");
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			System.out.println("[ERROR] Statement close 에러");
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			System.out.println("[ERROR] ResultSet close 에러");
			e.printStackTrace();
		}
	}
	
	// 3. 저장 메소드
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			System.out.println("[ERROR] Commit 에러");
			e.printStackTrace();
		}
	}
	
	//4. 취소 메소드
	public static void rollback (Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			System.out.println("[ERROR] RollBack 에러");
			e.printStackTrace();
		}
	}
	
	
}
