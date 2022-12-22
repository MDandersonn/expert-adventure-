package C02;



import java.sql.Connection;
import java.util.Date;

import C03_employeeMVC.EmployeeVO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class C02_2_Prepared_InsertVO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Oracle Driver 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Database Connection 생성
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "dev01";
		String password = "dev01";
		Connection conn = DriverManager.getConnection(url, username, password);
		

		
		EmployeeVO emp =new EmployeeVO();
		emp.setEmpId(210);
		emp.setFirstName("길동");
		emp.setLastName("홍");
		emp.setEmail("HGILDONG");
		emp.setPhoneNumber("512.123.1234");
		emp.setHireDate(new Date());//util.date인지 sql.date인지 잘구분
		emp.setJobId("IT_PROG");
		emp.setSalary(2800);
		emp.setCommission(0);
		emp.setManagerId(103);
		emp.setDeptId(60);
		
		
		// INSERT, UPDATE, DELETE Query 작성
		String query = "INSERT INTO EMPLOYEES VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		// PreparedStatement 객체 생성
		PreparedStatement pstat = conn.prepareStatement(query);
//		java.util.Date now = new java.util.Date();이젠 필요없음
		pstat.setInt(1, emp.getEmpId());
		pstat.setString(2, emp.getFirstName());
		pstat.setString(3, emp.getLastName());
		pstat.setString(4, emp.getEmail());
		pstat.setString(5, emp.getPhoneNumber());
		pstat.setDate(6, emp.getHireDate());
		pstat.setString(7, emp.getJobId());
		pstat.setInt(8, emp.getSalary());
		pstat.setDouble(9, emp.getCommission()); // NULL
		pstat.setInt(10, emp.getManagerId());
		pstat.setInt(11, emp.getDeptId());
		
		// 작성한 Query 전송 후 int 반환 (반영된 행의 갯수이다.)
		int rs = pstat.executeUpdate();
		
		// 반환 받은 ResultSet 의 내용 추출 및 추가 작성
		System.out.println(rs + " 개 행이 반영되었습니다.");
		
		// Database 관련 연결 정보 Close
		pstat.close();
		conn.close();
	}

}
