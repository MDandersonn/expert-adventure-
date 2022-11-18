package C03_employeeMVC;

import java.util.ArrayList;



public class EmployeeView {
	
	public void print(ArrayList<EmployeeVO> datas) {
		for(EmployeeVO emp : datas ) {
			System.out.println(emp);
		}
	}

}
