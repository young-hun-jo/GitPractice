package MainPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		Connection conn = null; // DB에 연결된 상태(세션)을 담은 객체
		PreparedStatement pstm = null; // SQL문을 나타내는 객체
		ResultSet rs = null; // 쿼리문을 날린것에 대한 반환값을 담을 객체
	
		
		DBConnection.getConnection();
		
	}

}
