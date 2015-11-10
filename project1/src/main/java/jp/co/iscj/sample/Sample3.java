package jp.co.iscj.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample3 {
	public void func3() throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn;
		Statement stmt;
		ResultSet rset;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:ORCL", "scott", "tiger");
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select EMPNO, ENAME from EMP");
			while (rset.next()) {
				//System.out.println(rset.getInt(1) + "\t" + rset.getString(2));
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			//e.printStackTrace();
		}
	}

}
