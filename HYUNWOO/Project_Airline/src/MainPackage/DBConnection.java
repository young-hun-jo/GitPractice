package MainPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection dbConn;

	public static Connection getConnection() {

		Connection conn = null;

		try {
			String user = "ddit";
			String pw = "java";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Connected Successfully to Database");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("Driver laoding Fail : " + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("Connection Fail : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unknown Error");
			e.printStackTrace();
		}

		return conn;

	}

}