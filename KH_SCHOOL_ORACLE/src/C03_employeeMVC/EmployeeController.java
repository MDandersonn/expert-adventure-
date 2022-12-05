package C03_employeeMVC;

import java.util.ArrayList;

public class EmployeeController {
	private EmployeeDAO empDao= new EmployeeDAO();
	private EmployeeView view = new EmployeeView();
	
	public void getAll() {
		ArrayList<EmployeeVO> datas = empDao.selectAll();
		view.print(datas);
	}

	public void getId(int id) {
		EmployeeVO data = empDao.selectId(id);
		view.print(data);
	}

	public void getName(String name) {
		ArrayList<EmployeeVO> datas = empDao.selectName(name);
		view.print(datas);
	}

	public void getDeptName(String deptName) {
		ArrayList<EmployeeVO> datas = empDao.selectDeptName(deptName);
		view.print(datas);
	}

	public void getJobName(String jobName) {
		ArrayList<EmployeeVO> datas = empDao.selectJobName(jobName);
		view.print(datas);
	}
	
	

}
