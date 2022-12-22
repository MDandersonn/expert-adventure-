package C04_DepartmentMVC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import C03_employeeMVC.OracleConnection;

public class DepartmentDAO {
	private OracleConnection oc ;
	
	
	public DepartmentDAO() {
		try {
			oc  = new OracleConnection("localhost:1521/XEPDB1","dev01","dev01");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	
	public ArrayList<DepartmentVO> selectAll() {
		
		ArrayList<DepartmentVO> al1 = new ArrayList<>();
		String query="select * from departments";
		try {
			oc.getPrepared(query);
			ResultSet rs=   oc.sendSelect();
			while(rs.next()) {
				DepartmentVO dep= new DepartmentVO();
				dep.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
				dep.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				dep.setManagerId(rs.getInt("MANAGER_ID"));
				dep.setLocation_Id(rs.getInt("LOCATION_ID"));
				al1.add(dep);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al1; 
		
		
		
		
		
	}

}
