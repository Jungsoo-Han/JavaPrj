package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws SQLException, SQLSyntaxErrorException {

		// Class.forName("oracle.jdbc.driver.OracleDriver"); �ֽŹ������� ���ص� �ȴ�.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[ȸ�� �˻� ���α׷�]");
		System.out.println("�̸� �˻� �Է� : ");
		String name = scan.nextLine();

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM MEMBER WHERE NAME LIKE '%"+ name + "%'" ;

		Connection con = DriverManager.getConnection(url, "c##sist", "dclass"); // ������
																				// ����
		Statement st = con.createStatement(); // ���� ����
		ResultSet rs = st.executeQuery(sql); // �� �׸� ����
		
		System.out.printf("���̵�\t �̸�\t ����");
		
		while (rs.next()) {
			
			String mid = rs.getString("MID");
			String resultName = rs.getString("NAME");
			int age = rs.getInt("AGE");
			System.out.println();
			System.out.printf("%s \t %s \t %s \n", mid, resultName, age);
			
		}
		
		
		
		
		
		

//		while (rs.next()) {
//
//			// rs.next(); // �������� ���ڵ� �ϳ��� �����°���
//
//			String mid = rs.getString("MID");
//
//			System.out.println(mid);
//
//		}

	}

}
