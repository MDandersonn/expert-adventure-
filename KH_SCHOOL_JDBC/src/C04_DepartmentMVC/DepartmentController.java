package C04_DepartmentMVC;

import java.util.ArrayList;

public class DepartmentController {
	DepartmentView DV= new DepartmentView();
	DepartmentDAO DAO= new DepartmentDAO();
	
	public void getAll() {
		ArrayList<DepartmentVO>  arr =DAO.selectAll();
		DV.print(arr);
		
	}

	public void getId(int id) {

		
	}

	public void getName(String name) {
	}

	public void getManagerID(String managerID) {
	}

	public void getLocationID(String locationID) {
	}

}
