package C03_employeeMVC;

import java.util.ArrayList;



public class EmployeeView {
	
	public void print(ArrayList<EmployeeVO> datas) {
		for(EmployeeVO emp : datas ) {
			System.out.println(emp);
		}
	}

	public void print(EmployeeVO data) {
		if(data == null) {
			System.out.println("조회 결과 조건에 해당하는 데이터가 없습니다.");
			System.out.println("다른 값으로 다시 조회를 하세요.");
		} else {
			System.out.println(data);
		}
	}

}
