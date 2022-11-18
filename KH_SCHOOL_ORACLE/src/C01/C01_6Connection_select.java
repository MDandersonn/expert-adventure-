package C01;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import C03_employeeMVC.OracleConnection;

public class C01_6Connection_select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		OracleConnection oc = new OracleConnection("localhost:1521/XEPDB1","dev01","dev01");
		 	String query= "SELECT * FROM EMPLOYEES";
		 	
		   //작성한 쿼리 전송후 ResultSet반환
		 	oc.getPrepared(query);
		 	ResultSet rs = oc.sendSelect();
		   //반환 받은 ResultSet의 내용 추출 및 추가 작성
		 	SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		   while(rs.next()) {
			   int id = rs.getInt("EMPLOYEE_ID");
			   String fName = rs.getString("FIRST_NAME");
			   String lName= rs.getString("LAST_NAME");
			   Date hireDate=rs.getDate("HIRE_DATE");
			   System.out.printf(" | %d | %15s |%15s |%s \n",id,fName,lName,df.format(hireDate));
			   
			   
			   
		   }
		   //Database 관련 연결 정보 Close
		   oc.close();

		  
		  
		  
		  
		 
	}

}
