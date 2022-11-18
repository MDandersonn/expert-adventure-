package C04_DepartmentMVC;

import java.util.ArrayList;

public class DepartmentController {
	DepartmentView DV= new DepartmentView();
	DepartmentDAO DAO= new DepartmentDAO();
	
	public void getAll() {
		
		
		DV.print(DAO.selectAll());
		
	}

}
