package MainPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		Connection conn = null; // DB�� ����� ����(����)�� ���� ��ü
		PreparedStatement pstm = null; // SQL���� ��Ÿ���� ��ü
		ResultSet rs = null; // �������� �����Ϳ� ���� ��ȯ���� ���� ��ü
	
		
		DBConnection.getConnection();
		
	}

}
