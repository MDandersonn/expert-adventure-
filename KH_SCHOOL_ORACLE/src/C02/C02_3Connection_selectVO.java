package C02;

import C01.*;
import C03_employeeMVC.EmployeeVO;
import C03_employeeMVC.OracleConnection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



public class C02_3Connection_selectVO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//내가만든클래그 오라클커넥션 임포트
		OracleConnection oc = new OracleConnection("localhost:1521/XEPDB1","dev01","dev01");
		 	String query= "SELECT * FROM EMPLOYEES";
		 	
		 	
		 	//오라클커넥션이라는 클래스안에 getPrepared라는 메서드를만들었다.
		   //작성한 쿼리 전송후 ResultSet반환
		 	oc.getPrepared(query);
		 	ResultSet rs = oc.sendSelect();
		   //반환 받은 ResultSet의 내용 추출 및 추가 작성
		 	
		 	ArrayList<EmployeeVO> empArr =new ArrayList<EmployeeVO>();
		   while(rs.next()) {
			   EmployeeVO emp = new EmployeeVO();
			   	emp.setEmpId(rs.getInt("EMPLOYEE_ID"));
			   	emp.setFirstName(rs.getString("FIRST_NAME"));
			   	emp.setLastName(rs.getString("LAST_NAME"));
			   	emp.setHireDate(rs.getDate("HIRE_DATE"));
			   	empArr.add(emp);
			   
		   }
		   System.out.println(empArr);
		   //Database 관련 연결 정보 Close
		   oc.close();

		  
		  
		  
		  
		 
	}

}
