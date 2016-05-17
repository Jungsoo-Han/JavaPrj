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

		// Class.forName("oracle.jdbc.driver.OracleDriver"); 최신버전에선 안해도 된다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[회원 검색 프로그램]");
		System.out.println("이름 검색 입력 : ");
		String name = scan.nextLine();

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM MEMBER WHERE NAME LIKE '%"+ name + "%'" ;

		Connection con = DriverManager.getConnection(url, "c##sist", "dclass"); // 서버와
																				// 연결
		Statement st = con.createStatement(); // 문장 생성
		ResultSet rs = st.executeQuery(sql); // 빈 그릇 마련
		
		System.out.printf("아이디\t 이름\t 나이");
		
		while (rs.next()) {
			
			String mid = rs.getString("MID");
			String resultName = rs.getString("NAME");
			int age = rs.getInt("AGE");
			System.out.println();
			System.out.printf("%s \t %s \t %s \n", mid, resultName, age);
			
		}
		
		
		
		
		
		

//		while (rs.next()) {
//
//			// rs.next(); // 서버에서 레코드 하나를 가져온거임
//
//			String mid = rs.getString("MID");
//
//			System.out.println(mid);
//
//		}

	}

}
