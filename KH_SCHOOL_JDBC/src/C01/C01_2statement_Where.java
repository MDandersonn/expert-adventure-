package C01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class C01_2statement_Where {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * 자바로 오라클 DB에 접속하여 데이터 조회
		 * 	1.JDBC라이브러리 필요
		 * 		오라클사이트에서받는방법-찾기힘들고 로그인해야함
		 * 		maven repository에서 다운 - 자바라이브러리가 모아져있음
		 * 		ojdbc 라고 구글에 검색 jdk11사용하면 10,11,17버젼을 받아야함
		 * 		오라클설치한서버에도 있다 -C드라이브 app- user2- product - 21c - dbhomeXE - jdbc폴더-lib폴더-ojdbc11.jar (설치해야함.
		 * 
		 * 	2. JDBC라이브러리를 이클립스 프로젝트에 등록
		 * 		-1. 프로젝트 설정 메뉴로이동
		 * 		-2. JAVA build path메뉴로 이동 
		 * 		-3. Libraries 탭으로 이동
		 * 		-4. Classpath 선택 후 Add External JARs.. 버튼 클릭
		 * 		-5. JDBC 라이브러리 파일 선택
		 * 
		 * 3. 다음의 순서에 맞추어 코드작성
		 * 	-1. Oracle Driver 등록
		 *  -2. Database Connection 생성
		 *  -3. Statement 객체 생성
		 *  -4. Query 작성
		 *  -5. 작성한 쿼리 전송 후 ResultSet 반환
		 *  -6. 반환 받은 ResultSet의 내용 추출 및 추가작업
		 *  -7. Database 관련 연결정보 Close
		 */  
		  //Oracle Driver 등록 
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
		   //Database Connection생성
		 	String url= "jdbc:oracle:thin:@DB서버IP:포트번호/서비스명";
		 	
		 		//서버IP는 ipconfig 치면 나옴 or 네트워크상태
		 		// ipv4주소를 가져오면됨ex(192.168.20.58)
		 	
		 	
		 	
		 	url= "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		 	Connection conn=DriverManager.getConnection(url,"dev01","dev01");
		 		//getConnection(DB정보,계정명,비번)
		 	
		 	
		   //Statement 객체 생성
		 	Statement stat = conn.createStatement();
		 	
		   //Query작성 (쿼리 문자열에 세미클론은 쓰지않음)
		 	//사용자 입력을 사용하여 사원ID를 입력받고 입력받은 ID에 해당하는 사원만 조회후 출력
		 	Scanner sc = new Scanner(System.in);
		 	System.out.print("사원ID를 입력하세요:");
		 	String id1 = sc.nextLine();
		 	String query= "SELECT * FROM EMPLOYEES";
		 	query+= " WHERE EMPLOYEE_ID in ("+id1+")";
		 	
		   //작성한 쿼리 전송후 ResultSet반환
		 	ResultSet rs =stat.executeQuery(query);
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
		   rs.close();
		   stat.close();
		   conn.close();
		  
		  
		  
		  
		 
	}

}
