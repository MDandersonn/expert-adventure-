package C04_DepartmentMVC;

import java.util.ArrayList;

public class DepartmentView {
	
	public void print(ArrayList<DepartmentVO> al) {
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
	}

}
