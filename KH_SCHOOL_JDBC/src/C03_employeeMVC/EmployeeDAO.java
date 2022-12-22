package C03_employeeMVC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EmployeeDAO {
	
	private OracleConnection oc;
	
	public EmployeeDAO() {
		try {
			this.oc = new OracleConnection("localHost:1521/XEPDB1", "dev01", "dev01");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<EmployeeVO> selectAll() {
		String query = "SELECT * FROM EMPLOYEES";
		ArrayList<EmployeeVO> arr = new ArrayList<EmployeeVO>();
		
		try {
			this.oc.getPrepared(query);
			ResultSet rs = this.oc.sendSelect();
			
			while(rs.next()) {
				EmployeeVO emp = new EmployeeVO();
				emp.setEmpId(rs.getInt("EMPLOYEE_ID"));
				emp.setFirstName(rs.getString("FIRST_NAME"));
				emp.setLastName(rs.getString("LAST_NAME"));
				emp.setEmail(rs.getString("EMAIL"));
				emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				emp.setHireDate(rs.getDate("HIRE_DATE"));
				emp.setJobId(rs.getString("JOB_ID"));
				emp.setSalary(rs.getInt("SALARY"));
				emp.setCommission(rs.getDouble("COMMISSION_PCT"));
				emp.setManagerId(rs.getInt("MANAGER_ID"));
				emp.setDeptId(rs.getInt("DEPARTMENT_ID"));
				arr.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return arr;
	}
	public EmployeeVO selectId(int id) {
//		String query= "select * from employees where employee_id ="+id;
		String query= "select * from employees where employee_id = ?";
		
		
		EmployeeVO emp = new EmployeeVO();
		try {
			//System.out.println("oc.getPstat: " +oc.getPstat());
			
			//PreparedStatement pstat1 = oc.getPrepared(query); 
			//이렇게 입력하면 getPrepared에 의해 클래스변수에도 입력이된다. psatat1이 클래스변수랑 주소 같음.
			
			//pstat1.setInt(1, id);
			
			oc.getPrepared(query).setInt(1, id);
			//System.out.println("oc.getPstat: " +oc.getPstat());//같은객체
			//System.out.println("pstat1 :" + pstat1);//같은객체
			
			//ResultSet rs =pstat1.executeQuery();
			ResultSet rs = oc.sendSelect();
			while(rs.next()) {
				emp.setEmpId(rs.getInt("EMPLOYEE_ID"));
				emp.setFirstName(rs.getString("FIRST_NAME"));
				emp.setLastName(rs.getString("LAST_NAME"));
				emp.setEmail(rs.getString("EMAIL"));
				emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				emp.setHireDate(rs.getDate("HIRE_DATE"));
				emp.setJobId(rs.getString("JOB_ID"));
				emp.setSalary(rs.getInt("SALARY"));
				emp.setCommission(rs.getDouble("COMMISSION_PCT"));
				emp.setManagerId(rs.getInt("MANAGER_ID"));
				emp.setDeptId(rs.getInt("DEPARTMENT_ID"));
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return emp;
	}

	
	public ArrayList<EmployeeVO> selectName(String name) {
		return null;
	}

	
	
	
	public ArrayList<EmployeeVO> selectJobName(String jobName) {
		String query= "select * from employees where job_id= ?";
		ArrayList<EmployeeVO> arr = new ArrayList<>();
		try {
			
			PreparedStatement  pstat= oc.getPrepared(query);
			pstat.setString(1,jobName);
			
			ResultSet rs= oc.sendSelect();
			while(rs.next()) {
				EmployeeVO emp = new EmployeeVO();
				emp.setEmpId( rs.getInt("employee_ID"));
				emp.setFirstName(rs.getString("FIRST_NAME"));
				emp.setLastName(rs.getString("LAST_NAME"));
				emp.setEmail(rs.getString("EMAIL"));
				emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				emp.setHireDate(rs.getDate("HIRE_DATE"));
				emp.setJobId(rs.getString("JOB_ID"));
				emp.setSalary(rs.getInt("SALARY"));
				emp.setCommission(rs.getDouble("COMMISSION_PCT"));
				emp.setManagerId(rs.getInt("MANAGER_ID"));
				emp.setDeptId(rs.getInt("DEPARTMENT_ID"));
				arr.add(emp);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return arr;
	}

	public ArrayList<EmployeeVO> selectDeptName(String deptName) {
		return null;
	}




}