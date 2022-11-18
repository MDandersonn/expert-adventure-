package C03_employeeMVC;

import java.util.ArrayList;

public class EmployeeController {
	private EmployeeDAO empDao= new EmployeeDAO();
	private EmployeeView view = new EmployeeView();
	
	public void getAll() {
		ArrayList<EmployeeVO> datas = empDao.selectAll();
		view.print(datas);
	}
	
	

}
